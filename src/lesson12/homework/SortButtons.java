package lesson12.homework;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {
    public void sortByMobelFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByMobelToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByColorFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {


            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByColorToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {


            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByBodyMaterialFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }

                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByBodyMaterialToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {
                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o2.getVolume() != o1.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }

                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByPriceFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }

    }

    public void sortByPriceToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByVolumeFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByVolumeToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByPowerFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByPowerToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByWeightFromTo(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o1.getModel().compareTo(o2.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

    public void sortByWeightToFrom(TreeSet<Kettle> kettles) {
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {

            @Override
            public int compare(Kettle o1, Kettle o2) {

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }

                if (!o1.getModel().equals(o2.getModel())) {
                    return o2.getModel().compareTo(o1.getModel());
                }

                if (!o1.getColor().equals(o2.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }
                return 0;
            }
        });

        forSorting.addAll(kettles);
        for (Kettle k : forSorting) {
            System.out.println(k);
        }
    }

}
