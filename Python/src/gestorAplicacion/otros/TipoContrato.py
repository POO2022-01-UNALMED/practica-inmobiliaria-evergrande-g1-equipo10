'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Este enum simula los tipos de contratos de un inmueble que puede haber en la inmobiliaria 
'''

from enum import Enum

class TipoContrato(Enum):
    VENTA = "VENTA"
    ARRIENDO = "ARRIENDO"