import tkinter

def calc() :
    formula = entry_fomula_input.get()
    txt_var.set(eval(formula))

widget = tkinter.Tk()
widget.title("Simple Calculator")

entry_fomula_input = tkinter.Entry(widget, width=20, justify = 'right')
entry_fomula_input.grid(row=0, column=0, padx=5)
tkinter.Label(widget, text="=").grid(row=0, column=1)
txt_var = tkinter.StringVar()
tkinter.Label(widget, textvariable = txt_var, width=5, bg='white', anchor='w').grid(row=0, column=2, padx=5)
tkinter.Button(widget, text="실행", width = 6, command=calc).grid(row=0, column=4, padx=5)
# command : calc() 함수를 실행시키는 역할

widget.mainloop()