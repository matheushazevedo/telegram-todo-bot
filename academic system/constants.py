menu_to_subject = {
    1: 'Algorithms',
    2: 'Security',
    3: 'Web Development'
}

class RegistrationNotFound(Exception):
    def __init__(self, registration_number):
        self.registration_number = registration_number
        super().__init__(f"Registration {registration_number} not found.")
    
class InvalidAgeError(Exception):
    def __init__(self, message="Invalid age. Age must be a positive integer."):
        self.message = message
        super().__init__(self.message)
