
class TodoMain2 {
    public static void main(String[] args) {
        //Viewを作成する
        TodoView todoview = new TodoView();
        //Modelを作成する
        TodoList todolist = new TodoList();
        //ViewとModelを相互に関係付ける
        todolist.setTodoView(todoview);
        todoview.setTodoList(todolist);
        
        //Todoを作る（前回と同じ）
        //クラスDateの動作確認
        Date d1 = new Date();
        d1.setYear(2015);
        d1.setMonth(10);
        d1.setDay(31);
        //クラスTodoの動作確認
        Todo t1 = new Todo();
        t1.setName("Prepare Halloween");
        t1.setPriority(1);
        t1.setDeadline(d1);
        Todo t2 = new Todo();
        
        //todolistに追加してみる（追加すると自動的にViewが更新される）
        todolist.addTodo(t1);
        todolist.addTodo(t2);
        //todolistを標準出力にも出力してみる（Viewと中身が同じことが確認できる）
        todolist.show();
    }
}
