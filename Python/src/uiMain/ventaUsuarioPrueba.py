
import tkinter as tk
from tkinter import CENTER, ttk, NO , messagebox

from more_itertools import strip
from gestorAplicacion.herencia.ApartaEstudio import ApartaEstudio
from gestorAplicacion.herencia.Apartamento import Apartamento
from gestorAplicacion.herencia.Bodega import Bodega
from gestorAplicacion.herencia.Casa import Casa
from gestorAplicacion.herencia.Inmueble import Inmueble
from gestorAplicacion.otros.Pago import Pago
from gestorAplicacion.otros.Agente import Agente
from gestorAplicacion.otros.Cita import Cita

from uiMain.fieldFrame import fieldFrame

# exceptions
from uiMain.exepciones.ErrorAplicacion import ErrorAplicacion
from uiMain.exepciones.FunctionalException  import FunctionalException
from uiMain.exepciones.FieldException import FieldException
from uiMain.exepciones.YaPagadoException import YaPagadoException
from uiMain.exepciones.MesYaPagadoException import MesYaPagadoException
from uiMain.exepciones.NonExistException import NonExistException
from uiMain.exepciones.NumericException import NumericException
from uiMain.exepciones.EmptyException import EmptyException
from uiMain.exepciones.wordException import wordException


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
        #----------Submenu de gestionar citas---------------
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
        
        
        #----------Submenu de gestionar inmuebles----------
        self.submenu_GestionarInmuebles = tk.Menu(self.menuprocesos)
        
        self.menuprocesos.add_cascade(menu = self.submenu_GestionarInmuebles,
                                      label = 'Gestionar Inmuebles',
                                      command= lambda: None)
        
        #sub-submenu de ver inmuebles
        self.submenu_verInmuebles = tk.Menu(self.submenu_GestionarInmuebles)
        
        self.submenu_GestionarInmuebles.add_cascade(menu = self.submenu_verInmuebles,
                                      label = 'Ver Mis Inmuebles',
                                      command= lambda: None)
        
        self.submenu_verInmuebles.add_command(label= 'Ver Todos Mis Inmuebles',
                                                command= self.verInmuebles)
        
        self.submenu_verInmuebles.add_command(label= 'Ver Mis Apartaestudios',
                                                command= self.verApartaestudios)
        
        self.submenu_verInmuebles.add_command(label= 'Ver Mis Apartamentos',
                                                command= self.verApartamentos)
        
        self.submenu_verInmuebles.add_command(label= 'Ver Mis Casas',
                                                command= self.verCasas)
        
        self.submenu_verInmuebles.add_command(label= 'Ver Mis Bodegas',
                                                command= self.verBodegas)
        
            
        self.submenu_GestionarInmuebles.add_command(label = 'Realizar Pago',
                                                command= self.realizarPago)
        self.submenu_GestionarInmuebles.add_command(label='Ver Pagos',
                                                command=self.verPagos)
        self.submenu_GestionarInmuebles.add_command(label='Finalizar Contrato',
                                                command=self.finalizarContrato)
        
        #--------Submenu de Explorar Inmuebles--------------
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
        from uiMain.Inicio import Inicio
        self.VENTANA.destroy()
        Inicio()
        
    #---------------Procesos y consultas de Gestionar Citas---------------
    def agendarCita(self):
        self.resetVentana()

        cols = ["dia", "mes", "año", "hora", "ced. agente", "idInmueble"]

        self.nombre = tk.Label(self.VENTANA, text="Agendar Cita", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá agendar las citas para los inmuebles que quiera ver, por favor rellene los datos necesarios", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos", cols, "Valor")

        def funcionAgendarCita():
            from regex import search
            try:
                for col in cols:
                    if self.frame.getValue(col).strip() == "": # verificar campos vacios
                        raise EmptyException("Debe llenar el campo " + col.upper())

                    if search(r"[^0-9]", self.frame.getValue(col)) != None: # verificar campos numericos
                        raise NumericException("El campo " + col.upper() + " debe ser numerico")
                    
                if not Inmueble.existeInmueble(int(self.frame.getValue("idInmueble"))):
                    raise NonExistException("El inmueble ingresado no existe, por favor verifiquelo")

                if not Agente.existeAgente(int(self.frame.getValue("ced. agente"))):
                    raise NonExistException("El agente ingresado no existe, por favor verifiquelo")
                        
                cita = Cita(
                    dia = int(self.frame.getValue("dia")),
                    mes = int(self.frame.getValue("mes")),
                    ano = int(self.frame.getValue("año")),
                    hora = int(self.frame.getValue("hora")),
                    idAgente = int(self.frame.getValue("ced. agente")),
                    idInmueble = int(self.frame.getValue("idInmueble"))
                )

            except ErrorAplicacion as error:
                error.mostrarMensajeError()
            else:
                self.frame.borrarEntradas()
                messagebox.showinfo("", "La cita fue agendada con exito")

        self.frame.crearBotones(funcionAgendarCita)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verCitas(self):
        self.resetVentana()

        cols = ["idCita", "dia", "mes", "ano", "hora", "ced. agente", "idInmueble"]

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
            from regex import search
            try:

                if self.frame.getValue("idCita").strip() == "": # verificar campo vacio
                    raise EmptyException("Debe llenar el campo idCita")

                if search(r"[^0-9]", self.frame.getValue("idCita")) != None: # verificar campos numericos
                    raise NumericException("El campo idCita debe ser numerico")
                
                if not Cita.existeCita(int(self.frame.getValue("idCita"))): # verificar si existe la cita
                    raise NonExistException("La cita ingresada no existe, por favor verifiquela")
                
                Cita.cancelar(int(self.frame.getValue("idCita")))

            except ErrorAplicacion as error:
                error.mostrarMensajeError()
            else:
                self.frame.borrarEntradas()
                messagebox.showinfo("", "La cita fue cancelada con exito")

        self.frame.crearBotones(funcionCancelarCita)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)

    
    #-----------Procesos y consultas de Gestionar inmuebles-------------------
    
    #Frame de ver inmuebles
    def verInmuebles(self):
        self.resetVentana()

        cols = ["Id", "Tipo", "Dirección", "Precio", "Tipo contrato", "Área", "Amueblado", "Parqueadero carro",  "Parqueadero moto"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Inmuebles", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver los inmuebles que tenga en posesión", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)

        for i in Inmueble.getInmuebles():
            
            tipo = "Inmueble"
            if isinstance(i, ApartaEstudio):
                tipo = "Apartaestudio"
            elif isinstance(i, Apartamento):
                tipo = "Apartamento"
            elif isinstance(i, Bodega):
                tipo = "Bodega"
            elif isinstance(i, Casa):
                tipo = "Casa"
                
            tabla.insert("", "end", text="", values=(i.getIdInmueble(), tipo, i.getDireccion(), i.getPrecio(), i.getTipoContrato(), i.getArea(), i.getAmueblado(),i.getParqueaderoCarros(), i.getParqueaderoMotos()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
    def verApartaestudios(self):
        self.resetVentana()

        cols = ["Id", "Precio", "Tipo Contrato", "Área", "Amueblado","Parqueadero carro",  "Parqueadero moto", "Direccion", "Unidad", "Torre", "Interior", "# Habitaciones", "# Baños"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Apartaestudios", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver los apartaestudios que tenga en posesión", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)
        
        #filtrar los inmuebles tipo apartaestudio
        Apartaestudios = []
        for i in Inmueble.getInmuebles():
            if isinstance(i, ApartaEstudio):
                Apartaestudios.append(i)
                

        for a in Apartaestudios:
                
            tabla.insert("", "end", text="", values=(a.getIdInmueble(),a.getPrecio(), a.getTipoContrato(), a.getArea(), a.getAmueblado(), a.getParqueaderoCarros(), a.getParqueaderoMotos(), a.getDireccion(), a.getNombreUnidad(), a.getTorre(), a.getNumeroApto(), a.getNumHabitaciones(), a.getNumBanos()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
    def verApartamentos(self):
        self.resetVentana()

        cols = ["Id", "Precio", "Tipo Contrato", "Área", "Amueblado","Parqueadero carro",  "Parqueadero moto", "Direccion", "Unidad", "Torre", "Interior", "# Habitaciones", "# Baños", "# Patios", "# Balcones"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Apartamentos", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver los apartamentos que tenga en posesión", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)
        
        #filtrar los inmuebles tipo apartamento
        Apartamentos = []
        for i in Inmueble.getInmuebles():
            if isinstance(i, Apartamento):
                Apartamentos.append(i)
                

        for a in Apartamentos:
                
            tabla.insert("", "end", text="", values=(a.getIdInmueble(),a.getPrecio(), a.getTipoContrato(), a.getArea(), a.getAmueblado(), a.getParqueaderoCarros(), a.getParqueaderoMotos(), a.getDireccion(), a.getNombreUnidad(), a.getTorre(), a.getNumApto(), a.getNumHabitaciones(), a.getNumBanos(), a.getPatio(),a.getBalcon()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verCasas(self):
        self.resetVentana()

        cols = ["Id", "Precio", "Tipo Contrato", "Área", "Amueblado","Parqueadero carro",  "Parqueadero moto", "Direccion", "# Habitaciones", "# Baños", "# Patios", "# Balcones"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Casas", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver las casas que tenga en posesión", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)
        
        #filtrar los inmuebles tipo casa
        Casas = []
        for i in Inmueble.getInmuebles():
            if isinstance(i, Casa):
                Casas.append(i)
                

        for c in Casas:
                
            tabla.insert("", "end", text="", values=(c.getIdInmueble(),c.getPrecio(), c.getTipoContrato(), c.getArea(), c.getAmueblado(), c.getParqueaderoCarros(), c.getParqueaderoMotos(), c.getDireccion(),c.getNumHabitaciones(), c.getNumBanos(), c.getPatio(),c.getBalcon()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    def verBodegas(self):
        self.resetVentana()

        cols = ["Id", "Precio", "Tipo Contrato", "Área", "Amueblado","Parqueadero carro",  "Parqueadero moto", "Direccion", "Capacidad", "# Oficinas", "# Baños"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Bodegas", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver las bodegas que tenga en posesión", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)
        
        #filtrar los inmuebles tipo bodega
        Bodegas = []
        for i in Inmueble.getInmuebles():
            if isinstance(i, Bodega):
                Bodegas.append(i)
                

        for b in Bodegas:
                
            tabla.insert("", "end", text="", values=(b.getIdInmueble(),b.getPrecio(), b.getTipoContrato(), b.getArea(), b.getAmueblado(), b.getParqueaderoCarros(), b.getParqueaderoMotos(), b.getCapacidad(),b.getOficina(), b.getBano()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    #Frame de funcionalidad realizar pago
    def realizarPago(self):
        self.resetVentana()
        
        self.nombre = tk.Label(self.VENTANA, text="Realizar Pago", bd=10)
        
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá realizar los pagos de sus inmuebles, por favor rellene los datos", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos Inmueble que desea pagar", ["ID Inmueble", "Valor", "Año", "Mes"], "Valor", [None, None, None, None])
        
        def funcionRealizarPago(): #Funcion del botón aceptar que sirve para realizar un pago
            from regex import search

            try:
                for col in ["ID Inmueble", "Valor", "Año", "Mes"]:
                    #Verifica campos vacios
                    if self.frame.getValue(col).strip() == "": 
                        raise EmptyException("Debe llenar el campo " + col.upper())
                    
                     #Verifica que todos sean números
                    if search(r"[^0-9]", self.frame.getValue(col)) != None:
                        raise NumericException("El campo "+col.upper() + " debe ser numero posotivo")
                    
                #Verifica si el inmueble existe
                if not Inmueble.existeInmueble(int(self.frame.getValue("ID Inmueble"))):
                    raise NonExistException("El inmueble ingresado no existe, por favor verifiquelo")
                
                #Si es de arriendo verifica que no se pague el mismo mes más de una vez
                if (Inmueble.buscarInmueble(int(self.frame.getValue("ID Inmueble")))).getTipoContrato() == "ARRIENDO":
                    for pago in (Pago.verPagos(int(self.frame.getValue("ID Inmueble")))):
                        if pago.getMes() == int(self.frame.getValue("Mes")) and pago.getAno() == int(self.frame.getValue("Año")):
                            raise MesYaPagadoException("El inmueble que intenta pagar ya fue pagado este mes")
                
                #Si es de venta verifica que no se pueda pagar más de una vez
                if (Inmueble.buscarInmueble(int(self.frame.getValue("ID Inmueble")))).getTipoContrato() == "VENTA":
                    if len(Pago.verPagos(int(self.frame.getValue("ID Inmueble")))) != 0:
                        raise YaPagadoException("El inmueble ya fue pagado")
                
                #Verifica que el valor ingresado sea igual al precio que tiene el inmueble
                if (Inmueble.buscarInmueble(int(self.frame.getValue("ID Inmueble")))).getPrecio() != int(self.frame.getValue("Valor")):
                    raise FunctionalException("El inmueble que intenta pagar tiene un costo diferente al valor ingresado")
                
                #Verifica que el Mes sea valido
                if int(self.frame.getValue("Mes")) not in [1,2,3,4,5,6,7,8,9,10,11,12]:
                    raise FieldException("El valor del campo \"Mes\" no es válido")
                        
                
                p = Pago(int(self.frame.getValue("Valor")),int(self.frame.getValue("Año")), int(self.frame.getValue("Mes")), int(self.frame.getValue("ID Inmueble")))
                self.frame.borrarEntradas()
                
            
            except ErrorAplicacion as error:
                error.mostrarMensajeError()
            else:
                #ver el resultado
                ventana_dialogo = tk.Toplevel(self.VENTANA)
                ventana_dialogo.geometry("500x300")
                ventana_dialogo.resizable(False,False)
                ventana_dialogo.title("Resultado del pago")
                
                texto = "Se ha realizado un pago por: " + str(p.getValor()) + "\nEl mes número " + str(p.getMes()) + " del año "+ str(p.getAno()) + "\nAl inmueble con id " + str(p.getIdInmueble())
                tk.Label(ventana_dialogo, text= texto).pack(fill=tk.BOTH, expand=True)
        
        self.frame.crearBotones(funcionRealizarPago)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    
    #Frame de ver pago
    def verPagos(self):
        self.resetVentana()

        cols = ["Id", "Valor", "Año", "Mes", "Tipo inmueble", "Direccion", "Tipo contrato"]

        self.nombre = tk.Label(self.VENTANA, text="Ver Mis Pagos", bd=10)
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá ver los pagos que ha realizado a sus inmuebles", bd = 10)

        self.frame = tk.Frame(self.VENTANA)
        tabla = ttk.Treeview(self.frame, columns=cols)
        tabla.place(relheight=1, relwidth=1)
        
        tabla.column("#0", width=0,  stretch=False)
        tabla.heading("#0",text="",anchor=CENTER)

        for c in cols:
            tabla.column(c, anchor=CENTER, stretch=True, width=80)
            tabla.heading(c, text=c, anchor=CENTER)

        for p in Pago._pagos:
            i = Inmueble.buscarInmueble(p.getIdInmueble())
            
            tipo = "Inmueble"
            if isinstance(i, ApartaEstudio):
                tipo = "Apartaestudio"
            elif isinstance(i, Apartamento):
                tipo = "Apartamento"
            elif isinstance(i, Bodega):
                tipo = "Bodega"
            elif isinstance(i, Casa):
                tipo = "Casa"
                
            tabla.insert("", "end", text="", values=(p.getId(), p.getValor(), p.getAno(), p.getMes(), tipo, i.getDireccion(), i.getTipoContrato()))

        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
    
    
    #Frame de funcionalidad finalizar contrato
    def finalizarContrato(self):
        self.resetVentana()
        
        self.nombre = tk.Label(self.VENTANA, text="Finalizar contrato", bd=10)
        
        self.descripcion = tk.Label(self.VENTANA,text= "Aqui podrá realizar los finalizar el contrato de sus inmuebles, por favor rellene los datos necesarios", bd = 10 )
        
        self.frame = fieldFrame(self.VENTANA, "Datos", ["ID Inmueble"], "Valor", [None])
        
        def funcionFinalizarContrato(): #Funcion del botón aceptar que sirve para finalizar un contrato
            from regex import search
            try:
                # verificar campo vacio
                if self.frame.getValue("ID Inmueble").strip() == "": 
                    raise EmptyException("Debe llenar el campo \"ID Inmueble\"")

                # verificar campos numericos
                if search(r"[^0-9]", self.frame.getValue("idCita")) != None: 
                    raise NumericException("El campo \"ID Inmueble\" debe ser número positivo")
                
                #Verifica qie el inmueble exista
                if not Inmueble.existeInmueble(int(self.frame.getValue("ID Inmueble"))):
                    raise NonExistException("El inmueble ingresado no existe, por favor verifiquelo")
                
                #Verifica que sea de tipo arriendo
                if (Inmueble.buscarInmueble(int(self.frame.getValue("ID Inmueble")))).getTipoContrato() != "ARRIENDO":
                    raise FunctionalException("El inmueble que ingresó no es de tipo arriendo")
                
                idInmueble = self.frame.getValue("ID Inmueble")
                Cliente.finalizarContrato(idInmueble)
            
            except ErrorAplicacion as error:
                error.mostrarMensajeError()
            else:
                
                #ver el resultado
                ventana_dialogo = tk.Toplevel(self.VENTANA)
                ventana_dialogo.geometry("500x300")
                ventana_dialogo.resizable(False,False)
                ventana_dialogo.title("Resultado del pago")
                
                texto = "Usted ha finalizado el contrato de arrendamiento para\nel inmueble con id: " + str(idInmueble)
                tk.Label(ventana_dialogo, text= texto).pack(fill=tk.BOTH, expand=True)
            
        self.frame.crearBotones(funcionFinalizarContrato)
        
        self.nombre.pack()
        self.descripcion.pack()
        self.frame.pack(fill = tk.BOTH, expand=True)
        
    #-------------Procesos y consultas de Explorar Inmuebles--------------
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