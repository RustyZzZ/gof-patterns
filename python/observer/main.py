class NotificationChannel:

    def __init__(self):
        self._subscribers = []

    def send_update(self, update):
        for sub in self._subscribers:
            sub.update(update)

    def add_subscriber(self, subscriber):
        self._subscribers.append(subscriber)


class Lecturer:
    def __init__(self, publishr: NotificationChannel):
        self._publisher = publishr

    def send_update(self, msg: str):
        self._publisher.send_update(msg)


class Subscriber:
    def __init__(self):
        pass

    def update(self, msg):
        pass


class StudentSubscriber(Subscriber):

    def __init__(self, name):
        self._name = name
        super().__init__()

    def update(self, msg):
        print("Student" + self._name + " get Notification: " + msg)


class AssistantSubscriber(Subscriber):

    def __init__(self, name):
        self._name = name
        super().__init__()

    def update(self, msg):
        print("Assistant" + self._name + " get Notification: " + msg)


if __name__ == '__main__':
    publisher = NotificationChannel()
    publisher.add_subscriber(StudentSubscriber("Diachuk"))
    publisher.add_subscriber(StudentSubscriber("Ivanov"))
    publisher.add_subscriber(StudentSubscriber("Petrov"))
    publisher.add_subscriber(AssistantSubscriber("Antonov A.A."))
    publisher.add_subscriber(AssistantSubscriber("Pupkin V.V."))
    lecturer = Lecturer(publisher)
    lecturer.send_update("100 to everybody")
