package DZ_OOP.Tree_1;


interface Human {

    enum link {
        parent, child, brother, sister, husband, 
        wife, father, mother, dother, son
    }

    String getName();
}