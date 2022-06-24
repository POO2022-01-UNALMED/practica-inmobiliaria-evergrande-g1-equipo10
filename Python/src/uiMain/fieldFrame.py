#Es solo una prueba basada en la practica que mandaron como guia
import tkinter as tk
from tkinter import DISABLED, Frame

class fieldFrame(Frame):
    def __init__(self, ventana, tituloCriterios, criterios, tituloValores, valores = None, nohabilitado = None):
        super().__init__(ventana)
        self._tituloCriterios = tituloCriterios
        self._criterios = criterios
        self._tituloValores = tituloValores
        self._valores = valores
        self._nohabilitado = nohabilitado #Son los valores que no se pueden modificar
        self._entradas = list()
        
        
        self.label1 = tk.Label(self, text=self._tituloCriterios)
        self.label1.grid(padx = 80, column = 0, row = 0)
        
        self.label2 = tk.Label(self, text=self._tituloValores)
        self.label2.grid(padx = 80, column = 1, row = 0)
        
        for i in range(len(self._valores)):
            self.label3 = tk.Label(self, text=self._criterios[i])
            self.label3.grid(padx = 80, pady=2, column=0, row=i+1)
            if self._criterios[i] in self._nohabilitado:
                texto = tk.StringVar(value=self._valores[i])
                entrada = tk.Entry(self, width = 40, textvariable=texto, state=DISABLED, justify="center")
            else:
                texto = tk.StringVar(value=self._valores[i])
                entrada = tk.Entry(self, width = 40, textvariable=texto, justify="center")
        
            entrada.grid(pady =2, column=1, row=i+1)
            self._entradas.append(entrada)
    


    
    #Funcion del boton borrar
    def borrarEntradas(self):
        for entrada in self._entradas:
            entrada.delete(0, "end")
            
    #Funcion del boton aceptar
    def aceptar(self):
        pass
        
    def getValue(self, criterio):
        criterios_dict = dict(zip(self._criterios, self._valores))
        return criterios_dict[criterio]
    
    def getCriterios(self): 
        return self._criterios
        
    def getValores(self):
        return self._valores

    def setValores(self, valores):
        self._valores = valores
    
    def setEntradas(self, entradas):
        self._entradas = entradas


    def crearBotones(self):
        aceptar = tk.Button(self, text="Aceptar",command=self.aceptar).grid(pady = 50, column = 0, row = len(self._criterios)+1)
        borrar = tk.Button(self, text="Borrar",command=self.borrarEntradas).grid(pady = 50, column = 1, row = len(self._criterios)+1)