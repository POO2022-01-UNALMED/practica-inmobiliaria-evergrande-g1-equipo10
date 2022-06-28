'''
Autores: 
Julián Orozco Vanegas
Juan Nicolas Piedrahita Salas
David Escobar Ruiz

Esta clase simula el comportamiento de un inmueble tipo apartaestudio y sus caracteristicas
'''

from .Inmueble import Inmueble


class ApartaEstudio(Inmueble):
    def __init__(self, precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad, nombreUnidad, torre, numeroApto, numHabitaciones, numBanos):
        super().__init__(precio, direccion, area, numPisos, parqueaderoCarros, parquederoMotos, amueblado, tipoContrato, idUnidad)
        self._nombreUnidad = nombreUnidad
        self._torre = torre
        self._numeroApto = numeroApto
        self._numHabitaciones = numHabitaciones
        self._numBanos = numBanos
    
    #toString
    def __str__(self):
        return "| {:<4d} | {:<13s} | {:<14f} | {:<15s} | {:<6f} | {:<11s} | {:<19s} | {:<17s} | {:<20s} | {:<20s} | {:<7s} | {:<20s} | {:<21d} | {:<14d} |".format(self.getIdInmueble(),
                                                                                                                                                                   type(self).__name__,
                                                                                                                                                                   self.getPrecio(),
                                                                                                                                                                   self.getTipoContrato(),
                                                                                                                                                                   self.getArea(),
                                                                                                                                                                   self.getAmueblado(),
                                                                                                                                                                   self.getParqueaderoCarros(),
                                                                                                                                                                   self.getParqueaderoMotos(),
                                                                                                                                                                   self.getDireccion(),
                                                                                                                                                                   self.getNombreUnidad(),
                                                                                                                                                                   self.getTorre(),
                                                                                                                                                                   self.getNumeroApto(),
                                                                                                                                                                   self.getNumHabitaciones(),
                                                                                                                                                                   self.getNumBanos())
        
        
    #Getters and Setters
    def getNombreUnidad(self):
        return self._nombreUnidad
    
    def setNombreUnidad(self,nombre)        :
        self._nombreUnidad = nombre
        
    def getTorre(self):
        return self._torre
    
    def setTorre(self,torre):
        self._torre = torre
        
    def getNumeroApto(self):
        return self._numeroApto
    
    def setNumeroApto(self,apto):
        self._numeroApto = apto
        
    def getNumHabitaciones(self):
        return self._numHabitaciones
    
    def setNumHabitaciones(self, num):
        self._numHabitaciones = num
        
    def getNumBanos(self):
        return self._numBanos
    
    def setNumBanos(self, num):
        self._numBanos = num
        
    