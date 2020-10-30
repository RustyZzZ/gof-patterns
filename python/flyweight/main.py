class Group:

    def __init__(self, start_year, curator  # ...... many many fields
                 ):
        self.start_year = start_year
        self.curator = curator


class CachedGroups:
    groups = {}

    @staticmethod
    def add_group(group: Group):
        CachedGroups.groups[group.start_year] = group

    @staticmethod
    def remove_group(group_start_year):
        return CachedGroups.groups.pop(group_start_year)

    @staticmethod
    def get_group(group_start_year):
        return CachedGroups.groups[group_start_year]


class Student:

    def __init__(self, name, start_year, curator):
        self.name = name
        self.group = CachedGroups.get_group(start_year)

    def print(self):
        print(self.name + ' ' + str(self.group.start_year) + ' ' + self.group.curator)


if __name__ == '__main__':
    CachedGroups.add_group(Group(2015, "Ivanov"))
    CachedGroups.add_group(Group(2016, "Nikolaev"))
    CachedGroups.add_group(Group(2017, "Vasilyev"))
    CachedGroups.add_group(Group(2018, "Grozniy"))
    CachedGroups.add_group(Group(2019, "Diachuk"))

    diachuk = Student("Diachuk", 2015, "Ivanov")
    diachuk.print()
