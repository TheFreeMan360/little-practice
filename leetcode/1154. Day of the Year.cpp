class Solution {
public:
    int dayOfYear(string date) {
        int daysInMonth[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = stoi(date.substr(0, 4));
        int month = stoi(date.substr(5, 7));
        int day = stoi(date.substr(8, 10));

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && month > 2)
            ++day;
        while (--month > 0)
            day += daysInMonth[month - 1];
        return day;
    }
};