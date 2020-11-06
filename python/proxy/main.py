class Group:

    def __init__(self, start_year, curator):
        self.start_year = start_year
        self.curator = curator


class Student:

    def __init__(self, name, group):
        self.name = name
        self.group = group

    def print(self):
        print(self.name + ' ' + str(self.group.start_year) + ' ' + self.group.curator)


class StudentService:

    def __init__(self):
        pass

    def get_student(self, name) -> Student: pass


class DbStudentService(StudentService):
    students = [Student("Diachuk", Group(2015, "Ivanov")),
                Student("Flint", Group(2015, "Ivanov")),
                Student("Petrov", Group(2015, "Ivanov"))]

    def get_student(self, name):
        stud = next((x for x in DbStudentService.students if x.name == name), None)
        print("Found in db: " + stud.name)
        return stud


class DbStudentServiceProxy(StudentService):
    cache = []

    def __init__(self, student_service: StudentService):
        self.student_service = student_service
        super().__init__()

    def get_student(self, name):
        print("Start searching in cache")
        student = next((x for x in DbStudentServiceProxy.cache if x.name == name), None)
        if student is None:
            print("Did not find in cache")
            student = self.student_service.get_student(name)
            DbStudentServiceProxy.cache.append(student)
        else:
            print("found in cache: " + student.name)
        return student


if __name__ == '__main__':
    service = DbStudentService()
    proxy = DbStudentServiceProxy(service)
    proxy.get_student("Diachuk")
    proxy.get_student("Diachuk")
    proxy.get_student("Diachuk")
