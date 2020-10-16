class Student:
    def __init__(self, id, name):
        self.id = id
        self.name = name


class LegacyStudentRepository:
    def __init__(self):
        self.list = [Student(365, "Diachuk")]

    def get_by_id(self, id):
        return next((x for x in self.list if x.id == id), None)


class StudentModernRepository:
    def __init__(self):
        pass

    def get_by_id(self, id):
        pass


class StudentRepository(StudentModernRepository):
    def __init__(self):
        self.list = [Student(1, "Diachuk")]
        super().__init__()

    def get_by_id(self, id):
        return next((x for x in self.list if x.id == id), None)


class StudentService:

    def __init__(self, repo: StudentModernRepository):
        self.repo = repo

    def get_by_id(self, id):
        return self.repo.get_by_id(id)


class LegacyDbToNewAdapter(StudentModernRepository):

    def __init__(self, repo: LegacyStudentRepository):
        super().__init__()
        self.repo = repo

    def get_by_id(self, id):
        return self.repo.get_by_id(id)


if __name__ == '__main__':
    print(StudentService(StudentRepository()).get_by_id(1).name)
    modernLegacyDBRepo = LegacyDbToNewAdapter(LegacyStudentRepository())
    print(StudentService(modernLegacyDBRepo).get_by_id(365).name)
