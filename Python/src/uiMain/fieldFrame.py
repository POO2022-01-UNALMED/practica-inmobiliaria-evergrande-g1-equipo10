import tkinter as tk

class fieldFrame(tk.Frame):
    def __init__(self, master, tituloCriterios, criterios, tituloValores, valores = None, habilitado = None):
        super().__init__(master)

        self.config(highlightbackground="red", highlightthickness=1)

        self.criterio = tk.Label(self, text=tituloCriterios, font=("Arial", 14))
        self.criterio.grid(row=0, column=0)
        # self.criterio.pack(side="top")

        self.valor = tk.Label(self, text=tituloValores, font=("Arial", 14))
        self.valor.grid(row=0, column=1)
        # self.valor.pack(side="top")
        # /////////////////////////////////////////////////////////////////////////

        if valores == None: valores = [""]*len(criterios)

        if habilitado == None: habilitado = [True]*len(criterios)
        habilitado = list(map(lambda estado: "normal" if estado else "disabled", habilitado))

        self.inputs = {}
        for i in range(len(criterios)):

            nomCriterio = tk.Label(self, text=criterios[i], font=("Arial", 12))
            nomCriterio.grid(row=(i+1), column=0)

            self.inputs[criterios[i]] = tk.Entry(self, state=habilitado[i], textvariable=tk.StringVar(self, valores[i]))
            self.inputs[criterios[i]].grid(row=(i+1), column=1)


    def getValue(self, criterio):
        return self.inputs[criterio].get()

        
        
        
        
        
        
    # otra opcion para hacer el fieldframe
    # # titulos ///////////////////////////////////////////////////////////////////
    # izquierda = tk.Frame(self, highlightbackground="blue", highlightthickness=1)
    # izquierda.place(relheight=1, relwidth=0.35, relx=0, rely=0)

    # derecha = tk.Frame(self, highlightbackground="red", highlightthickness=1)
    # derecha.place(relheight=1, relwidth=0.65, relx=0.35, rely=0)

    # self.criterio = tk.Label(izquierda, text=tituloCriterios, font=("Arial", 14))
    # self.criterio.grid(row=0, column=0)
    # # self.criterio.pack(side="top")

    # self.valor = tk.Label(derecha, text=tituloValores, font=("Arial", 14))
    # self.valor.grid(row=0, column=0)
    # # self.valor.pack(side="top")
    # # /////////////////////////////////////////////////////////////////////////

    # if valores == None: valores = [""]*len(criterios)

    # if habilitado == None: habilitado = [True]*len(criterios)
    # habilitado = list(map(lambda estado: "normal" if estado else "disabled", habilitado))

    # self.inputs = {}
    # for i in range(len(criterios)):

    #     nomCriterio = tk.Label(izquierda, text=criterios[i], font=("Arial", 12))
    #     nomCriterio.grid(row=(i+1), column=0)

    #     self.inputs[criterios[i]] = tk.Entry(derecha,state=habilitado[i], textvariable=tk.StringVar(derecha, valores[i]))
    #     self.inputs[criterios[i]].grid(row=(i+1), column=0)

    # titulos ///////////////////////////////////////////////////////////////////