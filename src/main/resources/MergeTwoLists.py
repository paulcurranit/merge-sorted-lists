class MergeTwoLists:

    def merge(self, list1, list2):
        length1 = len(list1)
        length2 = len(list2)

        i1 = 0
        i2 = 0

        mergedlist = []

        while i1 < length1 or i2 < length2:
            if i1 >= length1:
                mergedlist.append(list2[i2])
                i2 = i2 + 1
            elif i2 >= length2:
                mergedlist.append(list1[i1])
                i1 = i1 + 1
            elif(list1[i1] < list2[i2]):
                mergedlist.append(list1[i1])
                i1 = i1 + 1
            else:
                mergedlist.append(list2[i2])
                i2 = i2 + 1

        return mergedlist

list1 = [1,2,4]
list2 = [1,3,4]

m = MergeTwoLists()
mergedlist = m.merge(list1, list2)

print(mergedlist)
    




