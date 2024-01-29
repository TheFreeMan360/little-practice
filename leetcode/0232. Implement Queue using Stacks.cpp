class MyQueue {
public:
    MyQueue() {
        
    }
    
    void push(int x) {
        this->input.push(x);
    }
    
    int pop() {
        this->changeIntoOutput();
        int tmp = this->output.top();
        this->output.pop();
        return tmp;
    }
    
    int peek() {
        this->changeIntoOutput();
        return this->output.top();
    }
    
    bool empty() {
        return this->input.empty() && this->output.empty();
    }

private:
    stack<int> input;
    stack<int> output;

    void changeIntoOutput(){
        if(!this->output.empty()) return;
        while(!this->input.empty()){
            this->output.push(this->input.top());
            this->input.pop();
        }
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */