'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta excepcion es la excepcion padre de todas las especificas usadas, general
'''

from tkinter.messagebox import showerror

class ErrorAplicacion(Exception):

    def __init__(self, mensaje):
        self._mensaje = "Manejo de errores de la Aplicación: " + mensaje
        super().__init__(self._mensaje)


    def mostrarMensajeError(self):
        showerror("Error", self._mensaje)