class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        num = 0
        new_list=[]

        for i in digits:
            num = num*10+i
        num +=1

        while num>0:
            temp=num%10
            new_list.append(temp)
            num //=10
        new_list = new_list[::-1]
        return new_list
        