import os
from PIL import Image, ImageTk
import tkinter as tk

# me quede en el punto 1, 4 opcion

class Inicio:
    H = 650
    W = 850

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

    def __init__(self):
        self.VENTANA = tk.Tk()
        self.VENTANA.geometry(F"{Inicio.W}x{Inicio.H}")
        self.VENTANA.title("Inicio")
        self.VENTANA.resizable(0,0)

        # estructura de frames ////////////////////////////////////////////// 
        self.P1 = tk.Frame(self.VENTANA, bg="blue", width=Inicio.W/2)
        self.P1.pack(side="left", fill="both")
        
        self.P2 = tk.Frame(self.VENTANA, bg="red", width=Inicio.W/2)
        self.P2.pack(side="right", fill="both")

        self.P3 = tk.Frame(self.P1, bg="green")
        self.P3.place(relwidth=1, relheight=0.3)

        self.P4 = tk.Frame(self.P1, bg="pink")
        self.P4.place(relwidth=1, relheight=0.7, rely=0.3)

        self.P5 = tk.Frame(self.P2, bg="orange")
        self.P5.place(relwidth=1, relheight=0.3)

        self.P6 = tk.Frame(self.P2, bg="purple")
        self.P6.place(relwidth=1, relheight=0.7, rely=0.3)
        # /////////////////////////////////////////////////////////////////////

        self.bienvenida = tk.Label(self.P3, text="Bienvenido a EVERGRANDE", font=("Arial", 16))
        self.bienvenida.place(relheight=1, relwidth=1)

        self.hojaVida = tk.Label(self.P5, text="Haga click para ver las hojas\n de vida de los desarrolladores", font=("Arial", 12))
        self.hojaVida.place(relheight=1, relwidth=1)
        self.hojaVida.bind("<Button-1>", self.cambiarHV)

        # imagenes de los desarrolladores /////////////////////////////////////
        
        self.labelImgs = [tk.Label(self.P6) for _ in range(4)]

        self.labelImgs[0].grid(row=0, column=0)
        self.labelImgs[1].grid(row=0, column=1)
        self.labelImgs[2].grid(row=1, column=0)
        self.labelImgs[3].grid(row=1, column=1)

        self.imgs = [None]*4

        # self.labelImg1 = tk.Label(self.P6)
        # self.labelImg1.grid(row=0, column=0)
        # self.labelImg2 = tk.Label(self.P6)
        # self.labelImg2.grid(row=0, column=1)
        # self.labelImg3 = tk.Label(self.P6)
        # self.labelImg3.grid(row=1, column=0)
        # self.labelImg4 = tk.Label(self.P6)
        # self.labelImg4.grid(row=1, column=1)

        # self.img1 = tk.PhotoImage()
        # self.img2 = tk.PhotoImage()
        # self.img3 = tk.PhotoImage()
        # self.img4 = tk.PhotoImage()
        # ////////////////////////////////////////////////////////////////////

        self.VENTANA.mainloop()

    def cambiarHV(self, event):
        path = os.path.abspath("img/inicio")

        self.hojaVida.config(text=Inicio.HV[Inicio.perActual])

        for i in range(len(self.imgs)):
            self.imgs[i] = Image.open(path + f"/dev{Inicio.perActual}/{i}.jpg")
            
            self.imgs[i] = self.imgs[i].resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))

            self.imgs[i] = ImageTk.PhotoImage(self.imgs[i])

            self.labelImgs[i].config(image=self.imgs[i])
            

        # self.img1 = Image.open(path + f"/dev{Inicio.perActual}/0.jpg")
        # self.img2 = Image.open(path + f"/dev{Inicio.perActual}/1.jpg")
        # self.img3 = Image.open(path + f"/dev{Inicio.perActual}/2.jpg")
        # self.img4 = Image.open(path + f"/dev{Inicio.perActual}/3.jpg")

        # self.img1 = self.img1.resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))
        # self.img2 = self.img2.resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))
        # self.img3 = self.img3.resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))
        # self.img4 = self.img4.resize(( self.P6.winfo_width()//2 , self.P6.winfo_height()//2 ))

        # self.img1 = ImageTk.PhotoImage(self.img1)
        # self.img2 = ImageTk.PhotoImage(self.img2)
        # self.img3 = ImageTk.PhotoImage(self.img3)
        # self.img4 = ImageTk.PhotoImage(self.img4)

        # self.labelImg1.config(image = self.img1)
        # self.labelImg2.config(image = self.img2)
        # self.labelImg3.config(image = self.img3)
        # self.labelImg4.config(image = self.img4)

        Inicio.perActual = (Inicio.perActual + 1) % 3