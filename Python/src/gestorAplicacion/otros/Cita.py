class Cita:
    _citas = []

    def __init__(self, dia, mes, ano, hora, idAgente, idInmueble):
        self._dia = dia
        self._mes = mes
        self._ano = ano
        self._hora = hora
        self._idAgente = idAgente
        self._idInmueble = idInmueble

        try:
            self._idCita = None
            self._idCita = Cita._citas[-1]._idCita + 1
        except:
            self._idCita = 0

        Cita._citas.append(self)

    @classmethod
    def cancelar(cls, idCita):
        for i in range(len(cls._citas)):
            if cls._citas[i]._idCita == idCita:
                cls._citas.pop(i)
                break
    
    @classmethod
    def getCitaByID(cls, id):
        return list(filter(lambda cita: cita._idCita == id, cls._citas))[0]

    @classmethod
    def existeCita(cls, id):
        return len(list(filter(lambda cita: cita._idCita == id, cls._citas))) > 0

    def __str__(self):
        return ""

    # getters y setters
    @classmethod
    def getCitas(cls):
        return cls._citas

    @classmethod
    def setCitas(cls, citas):
        cls._citas = citas

    def getIdCita(self):
        return self._idCita

    def setIdCita(self, idCita):
        self._idCita = idCita

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

    def setDia(self, dia):
        self._dia = dia

    def setMes(self, mes):
        self._mes = mes

    def setAno(self, ano):
        self._ano = ano

    def setHora(self, hora):
        self._hora = hora

    def setIdAgente(self, idAgente):
        self._idAgente = idAgente

    def setIdInmueble(self, idInmueble):
        self._idInmueble = idInmueble
