#include <iostream>
using namespace std;

class Node{
public:
    string name;
    string author;
    int pages;
    float price;
    Node *next;
    
};

Node * addBook(string name,string author,int pages,float price,int pos,Node *f){
    Node *t;
    t=new Node();
    t->name=name;
    t->author=author;
    t->pages=pages;
    t->price=price;
    t->next=NULL;
    
    if(pos==1)
    {
        t->next=f;
        f=t;
        return f;
        
    }
    else
    {
        int i;
        Node *s=f;
        for(i=1;i<pos-2 && s!=NULL;i++){
            s=s->next;
        }
        if(s==NULL){
            cout<<"Invalid Position";
            return f;
        }
        t->next=s->next;
        s->next=t;
        return f;
        
    }
    
}
void display(Node *f){
    Node *t;
    for(t=f;t!=NULL;t=t->next){
        cout<<"Bookname: "<<t->name<<"\n";
        cout<<"Book author: "<<t->author<<"\n";
        cout<<"No. of Pages: "<<t->pages<<"\n";
        cout<<"Price: "<<t->price<<"\n\n";
    }
}

void search(Node *f,string bookname){
    Node *t;
    for(t=f;t!=NULL;t=t->next){
        if(t->name==bookname){
            cout<<"Bookname: "<<t->name<<"\n";
            cout<<"Book author: "<<t->author<<"\n";
            cout<<"No. of Pages: "<<t->pages<<"\n";
            cout<<"Price: "<<t->price<<"\n";
        }
        else
            cout<<"No book found";
        
        }
}
    


Node * deleteBook(Node * head,string name){
     Node *s,*t;
     int i;
     if(head==NULL)
     {
         printf("Linked List is Empty..!!");
         return head;
     }
     while(head!=NULL)
     {
         if(head->name==name){
             t=head;
             head=head->next;
             free(t);
         }
         else
         {
             break;
         }
     }
     if(head==NULL)
        return head;
        
    for(s=head;s!=NULL && s->next!=NULL;s=s->next){
        
        if(s->next->name==name){
            t=s->next;
            s->next=t->next;
            free(t);
        }
    }
     return head;
    
    
}

int main()
{
    Node *head;
    head=NULL;
    string name,author;
    int pages,id,pos;
    float price;

    
    while (1) {
        cout << "\n\t\tWelcome to Virtual Library "
                "\n\t1.Add new Book"
                "\n\t2 Delete a Book"
                "\n\t3.Search Book"
                "\n\t4.view all All Books "
                "\n\t5.Exit";
        cout << "\nEnter your Choice :";
        int choice;
        cin>>choice;
        
        switch(choice)
        {
          case 1 :  cout << "\nEnter Name :";
                    getline(cin,name);
                    getline (cin,name);
                    cout << "\nEnter author :";
                    getline (cin, author);
                    cout << "\nEnter no. of pages :";
                    cin >> pages;
                    cout << "\nEnter Price :";
                    cin >> price;
                    cout<<"\nEnter pos :";
                    cin>>pos;
                    head=addBook(name,author,pages,price,pos,head);
                    display(head);
                    break;
          case 2 :  cout<<"Name of the book you want to Delete : ";
                    getline(cin,name);
                    getline(cin,name);
                    head=deleteBook(head,name);
                    break;
          case 3 :  cout<<"Enter name of book\n";
                    getline(cin,name);
                    getline(cin,name);
                    search(head,name);
                    break;
          case 4 :  display(head);
                    break;
          case 5 :  exit(0);
          
                    
        }
    }
   
   
}