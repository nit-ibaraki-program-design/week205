public void update() {
    l1.removeAll();
    Todo[] l = todolist.getList();
    for(int i=0; i<l.length; i++) {
        String str = "";
        str += "[" + String.valueOf(i) + "] ";
        if(l[i]!=null) {
            str += "(" + l[i].getPriority() + ") ";
            str += l[i].getName() + " ";
            Date d = l[i].getDeadline();
            str += d.getYear() + "/" + d.getMonth() + "/" + d.getDay();
        }
        l1.add(str);
    } 
}
