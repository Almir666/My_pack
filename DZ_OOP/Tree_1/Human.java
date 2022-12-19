package DZ_OOP.Tree_1;


interface Human<T>{
    enum link {
        parent, child, brother, sister
    }

    String getName();
}