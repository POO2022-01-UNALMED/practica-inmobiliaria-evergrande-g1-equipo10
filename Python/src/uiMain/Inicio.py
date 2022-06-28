'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase crea la ventana principal de la aplicación, la ventana de bienvenida
'''

import os
import tkinter as tk
from tkinter import CENTER, messagebox

from uiMain.ventanaUsuario import VentanaUsuario
from baseDatos.serializador import Serializador

class Inicio:
    H = 650 # height
    W = 1300 # width

    # controlar cual imagen del proyecto se muestra 
    imgEVERactual = 0

    # atributos para controlar que HV se muestra ///////////////////////////
    perActual = 0

    HV = [
        """Mi nombre es Juan Nicolas""",
        """Mi nombre es Julián Orozco\nTengo 19 años y estudio ing de sitemas e informática""", 
        """Mi nombre es David"""
    ]
    # ///////////////////////////////////////////////////////////////////////

    def __init__(self):
        # creación de ventana de inicio
        self.VENTANA = tk.Tk()

        # definición de dimensiones de ventana de inicio
        self.VENTANA.geometry(F"{Inicio.W}x{Inicio.H}")

        # asignación título ventana de inicio
        self.VENTANA.title("Inicio")

        # definición de ventana de inicio como no redimensionable
        self.VENTANA.resizable(0,0)

        # 
        self.VENTANA.option_add("*tearOff", False)
        
        # estructura de frames ////////////////////////////////////////////// 
        self.P1 = tk.Frame(self.VENTANA, width=Inicio.W/2)
        self.P1.pack(side="left", fill="both")
        
        self.P2 = tk.Frame(self.VENTANA, width=Inicio.W/2)
        self.P2.pack(side="right", fill="both")

        self.P3 = tk.Frame(self.P1)
        self.P3.place(relwidth=1, relheight=0.3)

        self.P4 = tk.Frame(self.P1)
        self.P4.place(relwidth=1, relheight=0.7, rely=0.3)

        self.P5 = tk.Frame(self.P2)
        self.P5.place(relwidth=1, relheight=0.3)

        self.P6 = tk.Frame(self.P2)
        self.P6.place(relwidth=1, relheight=0.7, rely=0.3)
        # /////////////////////////////////////////////////////////////////////

        # bienvenida al sistema
        self.bienvenida = tk.Label(self.P3, text="Bienvenido a EVERGRANDE", font=("Arial", 16))
        self.bienvenida.place(relheight=1, relwidth=1)

        # mostrar HV de los desarrolladores
        self.hojaVida = tk.Label(self.P5, text="Haga click para ver las hojas\n de vida de los desarrolladores", font=("Arial", 12))
        self.hojaVida.place(relheight=1, relwidth=1)
        self.hojaVida.bind("<Button-1>", self.cambiarHV)
        self.hojaVida.config(cursor="hand2")

        # imagenes de los desarrolladores /////////////////////////////////////
        self.labelImgs = [tk.Label(self.P6) for _ in range(4)]

        self.labelImgs[0].grid(row=0, column=0, sticky="nw")
        self.labelImgs[1].grid(row=0, column=1, sticky="nw")
        self.labelImgs[2].grid(row=1, column=0, sticky="nw")
        self.labelImgs[3].grid(row=1, column=1, sticky="nw")
        # ////////////////////////////////////////////////////////////////////

        # boton de ingreso al sistema
        self.btnIngreso = tk.Button(self.P4, text="Ingreso al sistema",cursor="hand2", command=self.ingresoSistema)
        self.btnIngreso.place(relx=0, rely=0.7, relheight=0.3, relwidth=1)

        # imagenes del proyecto /////////////////////////////////////////////
        self.labelEVERGRANDE = tk.Label(self.P4)
        self.labelEVERGRANDE.place(relx=0, rely=0, relheight=0.7, relwidth=1)
        self.labelEVERGRANDE.bind("<Enter>", self.cambiarImgEVERGRANDE)

        self.cambiarImgEVERGRANDE()
        #Menu Inicio///////////////////////////
        self.menuBar = tk.Menu(self.VENTANA)
        self.VENTANA.config(menu = self.menuBar)
        
        self.menu1 = tk.Menu(self.menuBar)
        self.menuBar.add_cascade(label = "Inicio", menu = self.menu1)
        
        self.menu1.add_command(label = "Salir", command= self.salir)
        self.menu1.add_command(label = "Descripcion", command= self.descripcion)
        # ///////////////////////////////////////////////////////////////////

        self.VENTANA.mainloop()

    def cambiarHV(self, event):
        path = os.path.abspath("img/inicio")

        self.hojaVida.config(text=Inicio.HV[Inicio.perActual])

        imgs = [None]*4
        for i in range(4):
            imgs[i] = tk.PhotoImage(file=path + f"/dev{Inicio.perActual}/{i}.png")

            self.labelImgs[i].config(image=imgs[i])
            self.labelImgs[i].image = imgs[i]
        
        Inicio.perActual = (Inicio.perActual + 1) % 3

    def salir(self):
        Serializador.serializarTodo()
        self.VENTANA.destroy()
    
    def descripcion(self):
        self.bienvenida.place_forget()
        descripcion = "Bienvenido a EVERGRANDE\n"
        descripcion += "\nDescripción del sistema: Se creó una solución aplicando la programación orientada\n"
        descripcion += "a objetos para el problema que suponía la inmobiliaria Evergrande. El cliente necesita\n"
        descripcion += "una aplicación para realizar diversas tareas relacionadas con los inmuebles propios y los\n"
        descripcion += "ofrecidos por la inmobiliaria. En dicha solución el cliente puede gestionar sus citas \n"
        descripcion += "(visualizarlas, agendarlas y cancelarlas), gestionar sus propios inmuebles (visualizar su \n"
        descripcion += "información general, realizar y ver con claridad los pagos realizados y finalizar sus contratos\n"
        descripcion += "de arrendamiento), además de explorar nuevos inmuebles que despierten su interés y así guiarlo\n"
        descripcion += "a una compra exitosa de este, a iniciar un contrato de arrendamiento o a ver los presentados por\n"
        descripcion += "las unidades residenciales asociadas a Evergrande."
        self.bienvenida = tk.Label(self.P3, text=descripcion, font=("Arial", 11))
        self.bienvenida.place(relheight=1, relwidth=1)
        
    def ingresoSistema(self):
        self.VENTANA.destroy()
        VentanaUsuario()

    def cambiarImgEVERGRANDE(self, event = None):
        path = os.path.abspath("img/inicio/EVERGRANDE")

        imgLabelEVERGRANDE = tk.PhotoImage(file=path + f"/{self.imgEVERactual}.png")

        self.labelEVERGRANDE.config(image=imgLabelEVERGRANDE)
        self.labelEVERGRANDE.image = imgLabelEVERGRANDE

        Inicio.imgEVERactual = (Inicio.imgEVERactual + 1) % 5