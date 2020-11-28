class UniversityClass:
    def __init__(self, subj):
        self._subj = subj

    def start(self):
        self._startNotify()
        self._in_progress()
        self._setMarks()
        self._finishClass()

    def _in_progress(self):
        print("Class in progress")

    def _startNotify(self):
        pass

    def _setMarks(self):
        pass

    def _finishClass(self):
        pass


class LectureClass(UniversityClass):
    def __init__(self, subj):
        super().__init__(subj)

    def _startNotify(self):
        print("Lecture is started " + self._subj)

    def _setMarks(self):
        print("No marks on lecture")

    def _finishClass(self):
        print("Lecture is finished " + self._subj)


class LabClass(UniversityClass):
    def __init__(self, subj):
        super().__init__(subj)

    def _startNotify(self):
        print("Lab is started " + self._subj)

    def _setMarks(self):
        print("Diachuk - 10, Petrovv -10, Ivanov - 5 ...")

    def _finishClass(self):
        print("Lab is finished " + self._subj)


if __name__ == '__main__':
    lab_class = LabClass("JAVA")
    lab_class.start()
