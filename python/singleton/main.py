from array import array
from builtins import print, type, super

from locale import str
from threading import Lock, Thread


class SingletonMeta(type):
    _instances = {}
    _lock: Lock = Lock()

    def __call__(cls, *args, **kwargs):
        with cls._lock:
            if cls not in cls._instances:
                instance = super().__call__(*args, **kwargs)
                cls._instances[cls] = instance
        return cls._instances[cls]


class ThreadSafeStudentDao(metaclass=SingletonMeta):
    db: array = None
    """
    We'll use this property to prove that our Singleton really works.
    """

    def __init__(self) -> None:
        self.db = []

    def save_student(self, student: str):
        self.db.append(student)

    def get_all_student(self):
        return self.db


def test_singleton(student: str) -> None:
    ThreadSafeStudentDao().save_student(student)
    print(ThreadSafeStudentDao().get_all_student())


if __name__ == "__main__":
    process1 = Thread(target=test_singleton, args=("Diachuk",))
    process2 = Thread(target=test_singleton, args=("Ivanov",))
    process1.start()
    process2.start()
