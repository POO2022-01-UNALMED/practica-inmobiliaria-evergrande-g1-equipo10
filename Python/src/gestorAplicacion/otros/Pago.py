'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de un pago realizado de un cliente a un inmueble y sus caracteristicas
'''

class Pago:
    _pagos = []

    def __init__(self, valor, ano, mes, idInmueble):
        self._valor = valor
        self._ano = ano
        self._mes = mes
        self._idInmueble = idInmueble

        self._idPago = len(Pago._pagos) + 1
        Pago._pagos.append(self)
    
    @classmethod
    def verPagos(cls, idInmueble = None):
        
        if idInmueble != None:
            return list(filter(lambda pago: pago._idInmueble == idInmueble, cls._pagos))
        else:
            return cls._pagos

    @classmethod
    def setPagos(cls, pagos):
        cls._pagos = pagos

    @classmethod
    def getPagos(cls):
        return cls._pagos

    # getters y setters

    def getValor(self):
        return self._valor
    def getAno(self):
        return self._ano
    def getMes(self):
        return self._mes
    def getIdInmueble(self):
        return self._idInmueble
    def getId(self):
        return self._idPago

    def setValor(self, valor):
        self._valor = valor
    def setAno(self, ano):
        self._ano = ano
    def setMes(self, mes):
        self._mes = mes
    def setIdInmueble(self, idInmueble):
        self._idInmueble = idInmueble