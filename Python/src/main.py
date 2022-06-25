import tkinter as tk

from baseDatos.serializador import Serializador
from uiMain.Inicio import Inicio

# Cita
from gestorAplicacion.otros.Cita import Cita

Cita.setCitas(Serializador.deserializar("Cita"))

Inicio()