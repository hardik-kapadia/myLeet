class Solution {
public:
    bool isValid(string s) {
        vector<char> brackets;

    for (int i = 0; i < s.length(); i++)
    {
        char c = s[i];

        if (c == '(' || c == '{' || c == '[')
        {
            brackets.push_back(c);
        }
        
        if (brackets.size() <= 0)
            return false;

        else if (c == ')')
        {
            if (brackets.back() == '(')
                brackets.pop_back();
            else
                return false;
        }

        else if (c == '}')
        {
            if (brackets.back() == '{')
                brackets.pop_back();
            else
                return false;
        }

        else if (c == ']')
        {
            if (brackets.back() == '[')
                brackets.pop_back();
            else
                return false;
        }
    }

    return brackets.size() == 0;
    }
};