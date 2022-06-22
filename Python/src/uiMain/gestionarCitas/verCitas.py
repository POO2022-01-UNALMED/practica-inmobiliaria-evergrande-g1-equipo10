import tkinter as tk
from uiMain.Plantilla import Plantilla
from gestorAplicacion.otros.Cita import Cita
from uiMain.fieldFrame import fieldFrame

class verCitas(Plantilla):

    def __init__(self):
        super().__init__(nomProceso="Ver Citas", desProceso="Se describen las citas del usuario")

        self.zonaProceso = fieldFrame(self.zonaImplementacion, "criterio prueba", ["1", "2", "3", "4"], "valor prueba", None, None)
        self.zonaProceso.place(relx=0, rely=0.2, relheight=0.8, relwidth=1)
        

        self.VENTANA.mainloop()
