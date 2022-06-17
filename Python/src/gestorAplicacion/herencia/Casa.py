from Inmueble import Inmueble

class Casa(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad,numHabitaciones,numBanos, patio, balcon):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
        self._patio = patio
        self._balcon = balcon
    
    #getters and setters 
    def getNumHabitaciones(self):
        return self._numHabitaciones
    
    def setNumHabitaciones(self, num):
        self._numHabitaciones = num
        
    def getNumBanos(self):
        return self._numBanos
    
    def setNumBanos(self, num):
        self._numBanos = num
        
    def getPatio(self):
        return self._patio
    
    def setPatio(self, patio):
        self._patio = patio
        
    def getBalcon(self):
        return self._balcon
    
    def setBalcon(self, balcon):
        self._balcon = balcon