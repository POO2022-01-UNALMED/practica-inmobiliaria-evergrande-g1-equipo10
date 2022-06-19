import os
from PIL import Image, ImageTk
import tkinter as tk

from .otrapagina import otraVentana

# FALTA EL MENU
class Inicio:
    H = 650 # height
    W = 850 # width

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
        """hoja vida 2""", 
        """hoja vida 3"""
    ]
    # ///////////////////////////////////////////////////////////////////////

    def __init__(self):
        self.VENTANA = tk.Tk()
        self.VENTANA.geometry(F"{Inicio.W}x{Inicio.H}")
        self.VENTANA.title("Inicio")
        self.VENTANA.resizable(0,0)

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

        self.labelImgs[0].grid(row=0, column=0)
        self.labelImgs[1].grid(row=0, column=1)
        self.labelImgs[2].grid(row=1, column=0)
        self.labelImgs[3].grid(row=1, column=1)

        self.imgs = [None]*4
        # ////////////////////////////////////////////////////////////////////

        # boton de ingreso al sistema
        self.btnIngreso = tk.Button(self.P4, text="Ingreso al sistema",cursor="hand2" , command=self.ingresoSistema)
        self.btnIngreso.place(relx=0, rely=0.7, relheight=0.3, relwidth=1)

        # imagenes del proyecto /////////////////////////////////////////////
        self.labelEVERGRANDE = tk.Label(self.P4)
        self.labelEVERGRANDE.place(relx=0, rely=0, relheight=0.7, relwidth=1)
        self.labelEVERGRANDE.bind("<Enter>", self.cambiarImgEVERGRANDE)

        self.imgLabelEVERGRANDE = Image.open(os.path.abspath("img/inicio/EVERGRANDE") + f"/0.jpg")
        # self.imgLabelEVERGRANDE = self.imgLabelEVERGRANDE.resize(( self.labelEVERGRANDE.winfo_width() , self.labelEVERGRANDE.winfo_height() ))
        self.imgLabelEVERGRANDE = ImageTk.PhotoImage(self.imgLabelEVERGRANDE)
        self.labelEVERGRANDE.config(image=self.imgLabelEVERGRANDE)
        # ///////////////////////////////////////////////////////////////////

        self.VENTANA.mainloop()

    def cambiarHV(self, event):
        path = os.path.abspath("img/inicio")

        self.hojaVida.config(text=Inicio.HV[Inicio.perActual])

        for i in range(4):
            self.imgs[i] = Image.open(path + f"/dev{Inicio.perActual}/{i}.jpg")
            
            self.imgs[i] = self.imgs[i].resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))

            self.imgs[i] = ImageTk.PhotoImage(self.imgs[i])

            self.labelImgs[i].config(image=self.imgs[i])

        Inicio.perActual = (Inicio.perActual + 1) % 3


    def ingresoSistema(self):
        otraVentana()

    def cambiarImgEVERGRANDE(self, event):
        path = os.path.abspath("img/inicio/EVERGRANDE")

        self.imgLabelEVERGRANDE = Image.open(path + f"/{self.imgEVERactual}.jpg")

        self.imgLabelEVERGRANDE = self.imgLabelEVERGRANDE.resize(( self.labelEVERGRANDE.winfo_width() , self.labelEVERGRANDE.winfo_height() ))

        self.imgLabelEVERGRANDE = ImageTk.PhotoImage(self.imgLabelEVERGRANDE)

        self.labelEVERGRANDE.config(image=self.imgLabelEVERGRANDE)

        Inicio.imgEVERactual = (Inicio.imgEVERactual + 1) % 5