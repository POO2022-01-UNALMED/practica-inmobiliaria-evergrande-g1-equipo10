'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase es sirve como base del frame usado en los formularios en la ventana de usuario
'''

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
        
        if self._valores == None: self._valores = [""]*len(self._criterios)
        if self._nohabilitado == None: self._nohabilitado = [False]*len(self._criterios)
        
        self.label1 = tk.Label(self, text=self._tituloCriterios)
        self.label1.grid(padx = 80, column = 0, row = 0)
        
        self.label2 = tk.Label(self, text=self._tituloValores)
        self.label2.grid(padx = 80, column = 1, row = 0)

        # configuracion del grid
        self.grid_columnconfigure(0, weight=1)
        self.grid_columnconfigure(1, weight=1)
        self.grid_rowconfigure(0, weight=1)
        
        for i in range(len(self._criterios)):
            self.label3 = tk.Label(self, text=self._criterios[i])
            self.label3.grid(padx = 80, pady=2, column=0, row=i+1)

            texto = tk.StringVar(value=self._valores[i])
            if self._nohabilitado[i]:
                entrada = tk.Entry(self, width = 40, textvariable=texto, state=DISABLED, justify="center")
            else:
                entrada = tk.Entry(self, width = 40, textvariable=texto, justify="center")
        
            entrada.grid(pady=2, column=1, row=i+1)
            self._entradas.append(entrada)

            self.grid_rowconfigure(i+1, weight=1)

    
    
    #Funcion del boton borrar
    def borrarEntradas(self):
        for entrada in self._entradas:
            entrada.delete(0, "end")
        
    def getValue(self, criterio):
        criterios_dict = dict(zip(self._criterios, [entry.get() for entry in self._entradas]))
        return criterios_dict[criterio]
    
    def getCriterios(self): 
        return self._criterios
        
    def getValores(self):
        return self._valores

    def setValores(self, valores):
        self._valores = valores
    
    def setEntradas(self, entradas):
        self._entradas = entradas


    def crearBotones(self, funcionAceptar):
        aceptar = tk.Button(self, text="Aceptar",command=funcionAceptar).grid(pady = 50, column = 0, row = len(self._criterios)+1)
        borrar = tk.Button(self, text="Borrar",command=self.borrarEntradas).grid(pady = 50, column = 1, row = len(self._criterios)+1)