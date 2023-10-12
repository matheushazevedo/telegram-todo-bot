import random
from constants import RegistrationNotFound

students = []

def generate_unique_registration_number():
    while True:
        registration_number = random.randint(1000, 9999)
        if registration_number not in [student['registration_number'] for student in students]:
            return registration_number

def check_register_student(registration_number):
    for student in students:
        if student['registration_number'] == registration_number: return registration_number
    raise RegistrationNotFound(registration_number)

def register_student(name, age):
    registration_number = generate_unique_registration_number()
    student = {
        'registration_number': registration_number,
        'name': name,
        'age': age,
        'grades': {
            'Algorithms': [],
            'Security': [],
            'Web Development': []
        }
    }
    students.append(student)
    return student

def add_grade(registration_number, subject, grade):
    for student in students:
        if student['registration_number'] == registration_number:
            if subject in student['grades']:
                if len(student['grades'][subject]) < 5:  # Verifica se já existem 5 notas
                    student['grades'][subject].append(grade)
                    return True
                else:
                    print("Limite de 5 notas atingido para esta matéria.")
                    return False
    return False

def get_student(registration_number):
    for student in students:
        if student['registration_number'] == registration_number:
            return student
    raise RegistrationNotFound

def get_grades(registration_number, subject):
    for student in students:
        if student['registration_number'] == registration_number:
            if subject in student['grades']:
                return student['grades'][subject]
    return None  

def calculate_average(registration_number, subject):
    grades = get_grades(registration_number, subject)
    if grades:
        if len(grades) > 0:
            return sum(grades) / len(grades)
    return None
