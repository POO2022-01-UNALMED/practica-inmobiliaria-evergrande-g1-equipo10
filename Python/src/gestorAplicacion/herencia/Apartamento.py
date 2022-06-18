from Inmueble import Inmueble

class Apartamento(Inmueble):

    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad, nombreUnidad, torre, numApto, numHabitaciones, numBanos, patio, balcon):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)

        self._nombreUnidad = nombreUnidad
        self._torre = torre
        self._numApto = numApto
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
        self._patio = patio
        self._balcon = balcon


    def __str__(self):
        return ""

    # gettersy setters

    def getNombreUnidad(self):
        return self._nombreUnidad
    def getTorre(self):
        return self._torre
    def getNumApto(self):
        return self._numApto
    def getNumHabitaciones(self):
        return self._numHabitaciones
    def getNumBanos(self):
        return self._numBanos
    def getPatio(self):
        return self._patio
    def getBalcon(self):
        return self._balcon

    def setNombreUnidad(self, nombreUnidad):
        self._nombreUnidad = nombreUnidad
    def setTorre(self, torre):
        self._torre = torre
    def setNumApto(self, numApto):
        self._numApto = numApto
    def setNumHabitaciones(self, numHabitaciones):
        self._numHabitaciones = numHabitaciones
    def setNumBanos(self, numBanos):
        self._numBanos = numBanos
    def setPatio(self, patio):
        self._patio = patio
    def setBalcon(self, balcon):
        self._balcon = balcon