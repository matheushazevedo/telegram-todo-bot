from constants import RegistrationNotFound, InvalidAgeError, menu_to_subject
import student_management
import menu

def main():
    while True:
        menu.show_menu()
        subjects = menu_to_subject
        choice = menu.get_user_choice(1, 5)

        if choice == 1:
            name = input("Digite o nome do estudante: ")
            while True:
                try:
                    age = int(input("Digite a idade do estudante: "))
                    if age < 0: raise InvalidAgeError
                    break
                except ValueError:
                    print("\033[31mERRO: Verifique os dados e tente novamente.\033[m")
                except InvalidAgeError:
                    print("\033[31mERRO: Idade inválida, verifique e tente novamente.\033[m")
            student = student_management.register_student(name, age)
            print(student)

        elif choice == 2:
            while True:
                try:
                    register_number = student_management.check_register_student(int(input("Digite a matrícula do estudante: ")))
                    break
                except ValueError:
                    print("\033[31mERRO: Verifique os dados e tente novamente.\033[m")
                except RegistrationNotFound:
                    print("\033[31mERRO: Matrícula não encontrada, verifique e tente novamente.\033[m")

            menu.show_add_subject()
            subject_choice = menu.get_user_choice(1, 3)

            while True:
                try: 
                    grade = int(input("Digite a nota a ser inserida: "))
                    if grade < 0 or grade > 10: raise ValueError
                    break
                except ValueError:
                    print("\033[31mERRO: Verifique os dados e tente novamente.\033[m")
            
            student_management.add_grade(register_number, subjects[subject_choice], grade)

        elif choice == 3:
            while True:
                try:
                    register_number = student_management.check_register_student(int(input("Digite a matrícula do estudante: ")))
                    break
                except ValueError:
                    print("\033[31mERRO: Verifique os dados e tente novamente.\033[m")
                except RegistrationNotFound:
                    print("\033[31mERRO: Matrícula não encontrada, verifique e tente novamente.\033[m")

            student = student_management.get_student(register_number)
            print(f"Nome: {student['name']} \nIdade: {student['age']:<10} Matrícula: {student['registration_number']}")
            print(f"{'Disciplina':<18} {'Notas':<18} {'Média':<18}")

            for subject in subjects:
                subject_name = subjects[subject]
                grades = student_management.get_grades(register_number, subjects[subject])
                print(f"{subject_name:<18} {f' '.join(map(str, grades)):<18} {student_management.calculate_average(register_number, subjects[subject]):.2f}")

        elif choice == 4:
            while True:
                try:
                    register_number = student_management.check_register_student(int(input("Digite a matrícula do estudante: ")))
                    break
                except ValueError:
                    print("\033[31mERRO: Verifique os dados e tente novamente.\033[m")
                except RegistrationNotFound:
                    print("\033[31mERRO: Matrícula não encontrada, verifique e tente novamente.\033[m")

            student = student_management.get_student(register_number)
            print(f"Nome: {student['name']} \nIdade: {student['age']:<10} Matrícula: {student['registration_number']}")
        
        elif choice == 5:   
            break

if __name__ == "__main__":
    main()