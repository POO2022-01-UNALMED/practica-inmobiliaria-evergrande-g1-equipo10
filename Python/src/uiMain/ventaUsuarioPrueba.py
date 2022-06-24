
import tkinter as tk
from fieldFrame import fieldFrame

class Prueba:
    width = 700
    height = 400
    
    def __init__(self):
        
        self.VENTANA = tk.Tk()
        self.VENTANA.geometry(F"{Prueba.width}x{Prueba.height}")
        # self.VENTANA.resizable(0,0)
        self.VENTANA.title("VENTANA DE USUARIO")
        self.VENTANA.option_add("*tearOff", False)

        # menu //////////////////////////////////////////////
        self.menuBar = tk.Menu(self.VENTANA)
        self.VENTANA.config(menu=self.menuBar)

        #SubMenus
        self.menuarchivo = tk.Menu(self.menuBar)
        self.menuprocesos = tk.Menu(self.menuBar)
        self.menuayuda = tk.Menu(self.menuBar)
        
        self.menuBar.add_cascade(menu = self.menuarchivo,
                                 label = 'Archivo',
                                 command = lambda: None)
        self.menuBar.add_cascade(menu = self.menuprocesos,
                                 label = 'Procesos y Consultas',
                                 command = lambda: None)
        self.menuBar.add_cascade(menu = self.menuayuda,
                                 label = 'Ayuda',
                                 command = lambda: None)
        
        #Submenu de Archivo
        self.menuarchivo.add_command(label = 'Aplicacion',
                                     command= self.aplicacion)
        
        self.menuarchivo.add_command(label= 'Salir',
                                     command= self.salir)
        
        #Submenu de Procesos y Consultas 
        #Submenu de gestionar citas
        self.submenu_GestionarCitas = tk.Menu(self.menuprocesos)
        
        self.menuprocesos.add_cascade(menu = self.submenu_GestionarCitas,
                                      label = 'Gestionar Citas',
                                      command= lambda: None)
        
        self.submenu_GestionarCitas.add_command(label= 'Agendar Cita',
                                                command= self.agendarCita)
        self.submenu_GestionarCitas.add_command(label = 'Ver Citas',
                                                command= self.verCitas)
        self.submenu_GestionarCitas.add_command(label='Cancelar Citas',
                                                command=self.cancelarCitas)
        
        
        #Submenu de gestionar inmuebles
        self.submenu_GestionarInmuebles = tk.Menu(self.menuprocesos)
        
        self.menuprocesos.add_cascade(menu = self.submenu_GestionarInmuebles,
                                      label = 'Gestionar Inmuebles',
                                      command= lambda: None)
        
        self.submenu_GestionarInmuebles.add_command(label= 'Ver Mis Inmuebles',
                                                command= self.verInmuebles)
        
            
        self.submenu_GestionarInmuebles.add_command(label = 'Realizar Pago',
                                                command= self.realizarPago)
        self.submenu_GestionarInmuebles.add_command(label='Ver Pagos',
                                                command=self.verPagos)
        self.submenu_GestionarInmuebles.add_command(label='Finalizar Contrato',
                                                command=self.finalizarContrato)
        
        #Submenu de Explorar Inmuebles
        self.submenu_ExplorarInmuebles = tk.Menu(self.menuprocesos)
        
        self.menuprocesos.add_cascade(menu = self.submenu_ExplorarInmuebles,
                                      label = 'Explorar Inmuebles',
                                      command= lambda: None)
        
        self.submenu_ExplorarInmuebles.add_command(label= 'Ver Inmuebles Disponibles',
                                                command= self.verInmueblesDisponibles)
        self.submenu_ExplorarInmuebles.add_command(label = 'Comprar Inmueble',
                                                command= self.comprarInmueble)
        self.submenu_ExplorarInmuebles.add_command(label='Iniciar Contrato',
                                                command=self.iniciarContrato)
        self.submenu_ExplorarInmuebles.add_command(label='Presentar Informe',
                                                command=self.presentarInforme)
        
        
        #Submenu de Ayuda
        self.menuayuda.add_command(label = 'Acerca de',
                                     command= self.acercaDe)
        
        self.nombre = tk.Label(self.VENTANA, text="", bd=10 )
        self.descripcion = tk.Label(self.VENTANA, text="", bd=10)
        self.frame = tk.Frame()
        
        self.VENTANA.mainloop()
    
    
        
    def aplicacion(self): #Crear ventana de dialogo
        pass
    
    def salir(self):
        self.VENTANA.destroy()
        
    #Procesos de Gestionar Citas
    def agendarCita(self):
        pass
    
    def verCitas(self):
        pass
    
    def cancelarCitas(self):
        pass
    
    #Procesos de Gestionar inmuebles
    def verInmuebles(self):
        pass   
    
    def realizarPago(self):
        
        #Es para "reiniciar" los widgets y no se superpongan
        self.nombre.pack_forget()
        self.descripcion.pack_forget()
        self.frame.pack_forget()
        
        self.nombre = tk.Label(self.VENTANA, text="Realizar Pago", bd=10)
        
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá realizar los pagos de sus inmuebles, por favor rellene los datos", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos Inmueble que desea pagar", ["ID Inmueble", "Valor", "Años", "Mes"], "Valor", [None, None, None, None], [])
        self.frame.grid_columnconfigure(0, weight=1)
        self.frame.grid_columnconfigure(1, weight=1)
        self.frame.grid_rowconfigure(0, weight=1)
        self.frame.grid_rowconfigure(1, weight=1)
        self.frame.grid_rowconfigure(2, weight=1)
        self.frame.grid_rowconfigure(3, weight=1)
        self.frame.grid_rowconfigure(4, weight=1)
        self.frame.grid_rowconfigure(5, weight=1)
        
        
        self.frame.crearBotones()
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verPagos(self):
        pass
    
    def finalizarContrato(self):
        pass
        
    #Procesos de Explorar Inmuebles
    def verInmueblesDisponibles(self):
        pass
    
    def comprarInmueble(self):
        
        #Es para "reiniciar" los widgets y no se superpongan
        self.nombre.pack_forget()
        self.descripcion.pack_forget()
        self.frame.pack_forget()

        self.nombre = tk.Label(self.VENTANA, text="Comprar Inmueble", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Para comprar su inmueble deseado por favor rellene los datos", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos Inmueble deseado", ["ID", "DIRECCION", "Valor"], "Valor", [None, None, None], [])
        self.frame.grid_columnconfigure(0, weight=1)
        self.frame.grid_columnconfigure(1, weight=1)
        self.frame.grid_rowconfigure(0, weight=1)
        self.frame.grid_rowconfigure(1, weight=1)
        self.frame.grid_rowconfigure(2, weight=1)
        self.frame.grid_rowconfigure(3, weight=1)
        self.frame.grid_rowconfigure(4, weight=1)
        
        
        self.frame.crearBotones()
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
        
            
    
    def iniciarContrato(self):
        pass
    
    def presentarInforme(self):
        pass
    
    
    
    def acercaDe(self):
        pass
    
    
Prueba()