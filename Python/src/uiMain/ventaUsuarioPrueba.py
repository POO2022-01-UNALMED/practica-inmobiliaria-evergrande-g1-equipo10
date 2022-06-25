
import tkinter as tk
from tkinter import CENTER, ttk, NO
from uiMain.fieldFrame import fieldFrame # si se ejecuta desde el main toca con este import
# from fieldFrame import fieldFrame
'''from gestorAplicacion.herencia.Inmueble import Inmueble
from gestorAplicacion.otros.Pago import Pago'''

from gestorAplicacion.otros.Cita import Cita

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
        self.texto = tk.Text()
        
        self.VENTANA.mainloop()
    
    
    def resetVentana(self):
        #Es para "reiniciar" los widgets y no se superpongan
        self.nombre.pack_forget()
        self.descripcion.pack_forget()
        self.frame.pack_forget()
        self.texto.pack_forget()
        
    def aplicacion(self): #Crear ventana de dialogo
        ventana_dialogo = tk.Toplevel(self.VENTANA)
        ventana_dialogo.geometry("500x300")
        ventana_dialogo.resizable(False,False)
        ventana_dialogo.title("Aplicacion")
        
        texto = "EVERGRANDE, una inmobiliaria que busca crear un software capaz\nde simular su comportamiento e interacciones con el cliente, tales como\ncomprar o arrendar un inmueble, realizar pagos, agendar citas,\nvisualizar los inmuebles disponibles y los que son propios,\nver informes de las unidades afiliadas, entre otros."
        
        tk.Label(ventana_dialogo, text= texto).pack(fill=tk.BOTH, expand=True)
        
    
    def salir(self):
        self.VENTANA.destroy()
        
    #Procesos de Gestionar Citas
    def agendarCita(self):
        self.resetVentana()

        self.nombre = tk.Label(self.VENTANA, text="Agendar Cita", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá agendar las citas para los inmuebles que quiera ver, por favor rellene los datos necesarios", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos", ["dia", "mes", "ano", "hora", "idAgente", "idInmueble"], "Valor")

        def funcionAgendarCita():
            cita = Cita(
                dia = int(self.frame.getValue("dia")),
                mes = int(self.frame.getValue("mes")),
                ano = int(self.frame.getValue("ano")),
                hora = int(self.frame.getValue("hora")),
                idAgente = int(self.frame.getValue("idAgente")),
                idInmueble = int(self.frame.getValue("idInmueble"))
            )

            self.frame.borrarEntradas()

        self.frame.crearBotones(funcionAgendarCita)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verCitas(self):
        self.resetVentana()

        cols = ["idCita", "dia", "mes", "ano", "hora", "idAgente", "idInmueble"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Citas", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver las citas que tenga agendadas", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)

        for c in Cita.getCitas():
            tabla.insert("", "end", text="", values=(c.getIdCita(), c.getDia(), c.getMes(), c.getAno(), c.getHora(), c.getIdAgente(), c.getIdInmueble()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)

    
    def cancelarCitas(self):
        self.resetVentana()

        self.nombre = tk.Label(self.VENTANA, text="Cancelar Cita", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá cancelar las citas que tenga programadas, por favor rellene los datos necesarios", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos", ["idCita"], "Valor")

        def funcionCancelarCita():
            Cita.cancelar(int(self.frame.getValue("idCita")))
            self.frame.borrarEntradas()

        self.frame.crearBotones(funcionCancelarCita)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)

    
    #Procesos de Gestionar inmuebles
    def verInmuebles(self):
        self.resetVentana()
        
        self.texto = tk.Text(self.VENTANA, height=len(Inmueble._inmuebles)) 
        
        tex = ""
        for inmueble in Inmueble._inmuebles:
            tex += str(inmueble)
        
        self.texto.insert(tk.INSERT, tex)
        self.texto.pack(fill=tk.X, expand=True)
    
    def realizarPago(self):
        self.resetVentana()
        
        self.nombre = tk.Label(self.VENTANA, text="Realizar Pago", bd=10)
        
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá realizar los pagos de sus inmuebles, por favor rellene los datos", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos Inmueble que desea pagar", ["ID Inmueble", "Valor", "Años", "Mes"], "Valor", [None, None, None, None])
        
        
        self.frame.crearBotones()
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verPagos(self):
        self.resetVentana()
        
        self.texto = tk.Text(self.VENTANA, height=len(Pago._pagos)) 
        
        tex = ""
        for pago in Pago._pagos:
            tex += str(pago)
        
        self.texto.insert(tk.INSERT, tex)
        self.texto.pack(fill=tk.X, expand=True)
    
    def finalizarContrato(self):
        self.resetVentana()
        
        self.nombre = tk.Label(self.VENTANA, text="Finalizar contrato", bd=10)
        
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá realizar los finalizar el contrato de sus inmuebles, por favor rellene los datos necesarios", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos", ["ID Inmueble"], "Valor", [None])
        
        
        self.frame.crearBotones()
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
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
        
        self.frame = fieldFrame(self.VENTANA, "Datos Inmueble deseado", ["ID", "DIRECCION", "Valor"], "Valor", [None, None, None])
        
        
        self.frame.crearBotones()
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
        
            
    
    def iniciarContrato(self):
        pass
    
    def presentarInforme(self):
        pass
    
    
    
    def acercaDe(self):
        ventana_dialogo = tk.Toplevel(self.VENTANA)
        ventana_dialogo.geometry("500x300")
        ventana_dialogo.resizable(False,False)
        ventana_dialogo.title("Acerca de")
        
        texto = "AUTORES:\n\nJulián Orozco Vanegas\nJuan Nicolas Piedrahita Salas\nDavid Escobar Ruiz"
        
        tk.Label(ventana_dialogo, text= texto, font=('Times 15 italic bold')).pack(fill=tk.BOTH, expand=True)
        
    
if __name__ == "__main__":
    Prueba()