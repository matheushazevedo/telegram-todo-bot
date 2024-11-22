students_data = []
grades_data = []

def add_student(student_id, class_id, name, age):
    student = {
        'student_id' : student_id,
        'class_id' : class_id,
        'name' : name,
        'age' : age
    }

    students_data.append(student)

def add_grade(student_id, grade):
    for student in students_data:
        if student['student_id'] == student_id:
            if 'grade' not in student:
                student['grade'] = []
            student['grade'].append(grade)

def get_student_info(student_id):
    for student in students_data:
        if student['student_id'] == student_id:
            return student

def get_student_grades(student_id):
    for student in students_data:
        if student['student_id'] == student_id:
            if 'grades' in student:
                return student['grades']
    return []
