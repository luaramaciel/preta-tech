from flask import Flask, render_template, request, redirect, url_for
from estoque import LojaDeRoupas

app = Flask(__name__)
loja = LojaDeRoupas()

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        if 'nome' in request.form:  # Atualizar item existente
            try:
                nome = request.form['nome']
                quantidade = int(request.form['quantidade'])
                
                # Verificar se a quantidade é um número positivo
                if quantidade < 0:
                    raise ValueError("A quantidade deve ser um número positivo.")
                
                loja.update_roupa(nome, quantidade)
                return redirect(url_for('index'))
            except KeyError:
                error_msg = f"Roupa '{nome}' não encontrada."
                return render_template('error.html', error_msg=error_msg)
            except ValueError as e:
                error_msg = str(e)
                return render_template('error.html', error_msg=error_msg)
        elif 'novo_nome' in request.form:  # Adicionar novo item
            try:
                novo_nome = request.form['novo_nome']
                nova_quantidade = int(request.form['nova_quantidade'])
                
                # Verificar se a quantidade é um número positivo
                if nova_quantidade < 0:
                    raise ValueError("A quantidade deve ser um número positivo.")
                
                loja.roupas[novo_nome] = nova_quantidade
                return redirect(url_for('index'))
            except ValueError as e:
                error_msg = str(e)
                return render_template('error.html', error_msg=error_msg)
    else:
        roupas = loja.get_roupas()
        return render_template('index.html', roupas=roupas)

if __name__ == "__main__":
    app.run(debug=True)
