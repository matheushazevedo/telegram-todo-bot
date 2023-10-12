def show_menu():
    print(f"Sistema Academico \n[1] Cadastro de aluno \n[2] Inclusão de notas \n[3] Gerar relatórios \n[4] Consulta de informações \n[5] Sair")

def show_add_student_menu():
    print(f"Sistema Academico \n[1] Cadastro de aluno \n[2] Inclusão de notas \n[3] Gerar relatórios \n[4] Consulta de informações")

def show_add_subject():
    print(f"[1] Algoritmos\n[2] Segurança\n[3] Desenvolvimento Web")

def get_user_choice(min_choice, max_choice):
    while True:
        try:
            choice = int(input())
            if min_choice <= choice <= max_choice:
                return choice
            else:
                print("\033[31mERRO: Digite uma opção válida e tente novamente.\033[m")
        except ValueError:
            print("\033[31mERRO: Digite uma opção válida e tente novamente.\033[m")
