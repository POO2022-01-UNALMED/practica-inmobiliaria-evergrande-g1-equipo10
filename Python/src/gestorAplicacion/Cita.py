class Cita:
    _citas = []

    def __init__(self, ano, mes, dia, hora, idAgente, idInmueble):
        self._dia = dia
        self._mes = mes
        self._ano = ano
        self._hora = hora
        self._idAgente = idAgente
        self._idInmueble = idInmueble

        self._idCita = len(Cita._citas) + 1
        Cita._citas.append(self)

    @classmethod
    def cancelar(cls, idCita):
        for i in range(len(cls._citas)):
            if cls._citas[i]._idCita == idCita:
                cls._citas.pop(i)
                break
    
    @classmethod
    def getCitaByID(cls, id):
        return list(filter(lambda cita: cita.idCita == id, cls._citas))[0]

    # getters y setters
    @classmethod
    def getCitas(cls):
        return cls._citas

    @classmethod
    def setCitas(cls, citas):
        cls._citas = citas

    def getDia(self):
        return self._dia

    def getMes(self):
        return self._mes

    def getAno(self):
        return self._ano

    def getHora(self):
        return self._hora

    def getIdAgente(self):
        return self._idAgente

    def getIdInmueble(self):
        return self._idInmueble

    def getDia(self, dia):
        self._dia = dia

    def getMes(self, mes):
        self._mes = mes

    def getAno(self, ano):
        self._ano = ano

    def getHora(self, hora):
        self._hora = hora

    def getIdAgente(self, idAgente):
        self._idAgente = idAgente

    def getIdInmueble(self, idInmueble):
        self._idInmueble = idInmueble
