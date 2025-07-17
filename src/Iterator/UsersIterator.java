package Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class UsersIterator implements java.util.Iterator<Users> {
    private List<Users> users;
    private int index;

    public UsersIterator(List<Users> users, int index) {
        this.users = users;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < users.size()) {
            if (users.get(index).getAge() > 20) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Users next() {
        if (hasNext()) {
            Users user = users.get(index);
            index++;
            return user;
        }else  {
            throw new NoSuchElementException();
        }
    }
}
