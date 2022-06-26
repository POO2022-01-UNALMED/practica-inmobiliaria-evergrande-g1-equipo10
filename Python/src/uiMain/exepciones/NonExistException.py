from .FunctionalException import FunctionalException

# error cuando se busca algun objeto en el sistema y este no existe
class NonExistException(FunctionalException):
    def __init__(self, mensaje):
        super().__init__(mensaje)