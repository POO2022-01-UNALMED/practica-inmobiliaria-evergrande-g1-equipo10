import tkinter as tk

class Plantilla:
    
    def __init__(self, nomProceso="Nombre del proceso", desProceso="Descripcion del proceso", height=700, width=1000):

        self.VENTANA = tk.Tk()
        self.VENTANA.geometry(F"{width}x{height}")
        # self.VENTANA.resizable(0,0)
        self.VENTANA.title("EVERGRANDE")
        self.VENTANA.option_add("*tearOff", False)

        # menu //////////////////////////////////////////////
        menuBar = tk.Menu(self.VENTANA)
        self.VENTANA.config(menu=menuBar)

        menuArchivo = tk.Menu(menuBar)
        menuBar.add_cascade(label="Archivo", menu=menuArchivo)
        menuArchivo.add_command(label="Aplicacion", command=lambda: None) # colocar funcion del menu
        menuArchivo.add_command(label="Salir", command=lambda: None) # colocar funcion del menu

        menuBar.add_command(label="Procesos y Consultas", command=lambda: None) # colocar funcion del menu
        menuBar.add_command(label="Ayuda", command=lambda: None) # colocar funcion del menu
        # ///////////////////////////////////////////////////

        # zona 2 de la guia /////////////////////////////////
        self.zonaImplementacion = tk.Frame(self.VENTANA)
        self.zonaImplementacion.place(relheight=1, relwidth=1)
        
        # nombre del proceso
        zonaNomProceso = tk.Frame(self.zonaImplementacion)
        zonaNomProceso.place(relheight=0.05, relwidth=1)
        labelnom = tk.Label(zonaNomProceso, text=nomProceso, font=("Arial", 16))
        labelnom.place(relheight=1, relwidth=1)

        # descripcion del proceso
        zonaDesProceso = tk.Frame(self.zonaImplementacion)
        zonaDesProceso.place(relx=0, rely=0.05, relheight=0.15, relwidth=1)
        labelDes = tk.Label(zonaDesProceso, text=desProceso ,font=("Arial", 12))
        labelDes.place(relheight=1, relwidth=1)

        # zona de formularios y consultas
        self.zonaProceso = tk.Frame(self.zonaImplementacion) # por defecto es un Frame normal, si es un formulario de registro se debe cambiar por un fieldFrame en donde se implemente
        self.zonaProceso.place(relx=0, rely=0.2, relheight=0.8, relwidth=1)
        # ///////////////////////////////////////////////////