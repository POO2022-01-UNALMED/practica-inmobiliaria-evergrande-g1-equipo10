import os
from PIL import Image, ImageTk
import tkinter as tk
from tkinter import CENTER, messagebox

from uiMain.ventaUsuarioPrueba import Prueba

class Inicio:
    H = 650 # height
    W = 1300 # width

    # controlar cual imagen del proyecto se muestra 
    imgEVERactual = 1

    # atributos para controlar que HV se muestra ///////////////////////////
    # 0 => Juan Nicolas
    # 1 => 
    # 2 => 
    perActual = 0

    HV = [
        """
        Mi nombre es Juan Nicolas
        """,
        """Mi nombre es Julián Orozco""", 
        """hoja vida 3"""
    ]
    # ///////////////////////////////////////////////////////////////////////

    def __init__(self):
        self.VENTANA = tk.Tk()
        self.VENTANA.geometry(F"{Inicio.W}x{Inicio.H}")
        self.VENTANA.title("Inicio")
        self.VENTANA.resizable(0,0)
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
        color = ["red", "blue", "green", "purple"]
        self.labelImgs = [tk.Label(self.P6) for _ in range(4)]

        self.labelImgs[0].grid(row=0, column=0, sticky="nw")
        self.labelImgs[1].grid(row=0, column=1, sticky="nw")
        self.labelImgs[2].grid(row=1, column=0, sticky="nw")
        self.labelImgs[3].grid(row=1, column=1, sticky="nw")
        # ////////////////////////////////////////////////////////////////////

        # boton de ingreso al sistema
        self.btnIngreso = tk.Button(self.P4, text="Ingreso al sistema",cursor="hand2" , command=self.ingresoSistema)
        self.btnIngreso.place(relx=0, rely=0.7, relheight=0.3, relwidth=1)

        # imagenes del proyecto /////////////////////////////////////////////
        self.labelEVERGRANDE = tk.Label(self.P4)
        self.labelEVERGRANDE.place(relx=0, rely=0, relheight=0.7, relwidth=1)
        self.labelEVERGRANDE.bind("<Enter>", self.cambiarImgEVERGRANDE)

        self.imgLabelEVERGRANDE = Image.open(os.path.abspath("img/inicio/EVERGRANDE") + "/0.jpg")
        # self.imgLabelEVERGRANDE = self.imgLabelEVERGRANDE.resize(( self.labelEVERGRANDE.winfo_width() , self.labelEVERGRANDE.winfo_height() ))
        self.imgLabelEVERGRANDE = ImageTk.PhotoImage(self.imgLabelEVERGRANDE)
        self.labelEVERGRANDE.config(image=self.imgLabelEVERGRANDE)
        
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

            self.labelImgs[i].config(image=imgs[i], justify=CENTER)
            self.labelImgs[i].image = imgs[i]
        
        Inicio.perActual = (Inicio.perActual + 1) % 3

    def salir(self):
        self.VENTANA.quit()
    
    def descripcion(self):
        self.descripcion = messagebox.showinfo("Descripción del sistema","Se creó una solución aplicando la programación orientada a objetos para el problema que suponía la inmobiliaria Evergrande. El cliente necesita una aplicación para realizar diversas tareas relacionadas con los inmuebles propios y los ofrecidos por la inmobiliaria. En dicha solución el cliente puede gestionar sus citas (visualizarlas, agendarlas y cancelarlas), gestionar sus propios inmuebles (visualizar su información general, realizar y ver con claridad los pagos realizados y finalizar sus contratos de arrendamiento), además de explorar nuevos inmuebles que despierten su interés y así guiarlo a una compra exitosa de este, a iniciar un contrato de arrendamiento o a ver los presentados por las unidades residenciales asociadas a Evergrande.")
        
    def ingresoSistema(self):
        self.VENTANA.destroy()
        Prueba()

    def cambiarImgEVERGRANDE(self, event):
        path = os.path.abspath("img/inicio/EVERGRANDE")

        self.imgLabelEVERGRANDE = Image.open(path + f"/{self.imgEVERactual}.jpg")

        self.imgLabelEVERGRANDE = self.imgLabelEVERGRANDE.resize(( self.labelEVERGRANDE.winfo_width() , self.labelEVERGRANDE.winfo_height() ))

        self.imgLabelEVERGRANDE = ImageTk.PhotoImage(self.imgLabelEVERGRANDE)

        self.labelEVERGRANDE.config(image=self.imgLabelEVERGRANDE)

        Inicio.imgEVERactual = (Inicio.imgEVERactual + 1) % 5