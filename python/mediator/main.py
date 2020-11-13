class MessagingMediator:
    def __init__(self, students, lecturer, assistant):
        self._students = students
        self._lecturer = lecturer
        self._assistant = assistant

    def send_message(self, name, message):
        if name == "*":
            for student in self._students:
                print("Send to " + student + " message:" + message)
            print("Send to assistant message " + message)
        elif name == "^":
            print("Send to lecturer message " + message)
        else:
            print("Send to " + name + " message:" + message)


class Lecturer:
    def __init__(self):
        self._mediator = None

    def set_mediator(self, mediator: MessagingMediator):
        self._mediator = mediator

    def send_message(self, msg):
        print("Lecturer sent:")
        self._mediator.send_message("*", msg)


class Assistant:
    def __init__(self):
        self._mediator = None

    def set_mediator(self, mediator: MessagingMediator):
        self._mediator = mediator

    def send_message(self, name, msg):
        print("Assistant sent:")
        self._mediator.send_message(name, msg)


if __name__ == '__main__':
    lecturer = Lecturer()
    assist = Assistant()
    med = MessagingMediator(["Diachuk", "Ivanow", "Noris"], lecturer, assist)
    lecturer.set_mediator(med)
    assist.set_mediator(med)
    lecturer.send_message("Завтра пару відміняю")
    assist.send_message("Diachuk", "Здай лабораторні")
    assist.send_message("^", "івфівфів")
