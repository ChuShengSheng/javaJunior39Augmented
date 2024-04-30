package lesson12.homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WorkingWithCollections implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a == null)
            throw new NullPointerException("a == null");

        if (b == null)
            throw new NullPointerException("b == null");

        Collection<Integer> result = new LinkedList<>();

        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new LinkedList<>();

        for (Integer num: a){
            if(b.contains(num)){
                result.add(num);
            }
        }

        for (Integer num: b){
            if(a.contains(num)){
                result.add(num);
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null)
            throw new NullPointerException("a == null");

        if (b == null)
            throw new NullPointerException("b == null");

        Set<Integer> result = new HashSet<>();

        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();

        for (Integer num: a){
            if(b.contains(num)){
                result.add(num);
            }
        }

        for (Integer num: b){
            if(a.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new LinkedList<>();

        for (Integer num: a){
            if(!b.contains(num)){
                result.add(num);
            }
        }

        for (Integer num: b){
            if(!a.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

}
