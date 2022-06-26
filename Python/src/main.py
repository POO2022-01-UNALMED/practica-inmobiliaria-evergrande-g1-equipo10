import tkinter as tk

from baseDatos.serializador import Serializador
from uiMain.Inicio import Inicio
from uiMain.ventaUsuarioPrueba import Prueba

# Cita
from gestorAplicacion.otros.Cita import Cita

Cita.setCitas(Serializador.deserializar("Cita"))

Inicio()

# Prueba()