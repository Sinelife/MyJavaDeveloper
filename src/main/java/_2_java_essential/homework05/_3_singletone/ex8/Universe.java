package _2_java_essential.homework05._3_singletone.ex8;

import java.util.*;

class Universe {
    private static Universe universe;
    private List<GalaxyCluster> galaxyClusters;
    private List<Void> voids;
    private long age;

    private Universe() {}

    public static Universe getUniverse() {
        if (universe == null) {
            universe = new Universe();
        }
        return universe;
    }

    public List<GalaxyCluster> getGalaxyClusters() {
        return galaxyClusters;
    }

    public void setGalaxyClusters(List<GalaxyCluster> galaxyClusters) {
        this.galaxyClusters = galaxyClusters;
    }

    public List<Void> getVoids() {
        return voids;
    }

    public void setVoids(List<Void> voids) {
        this.voids = voids;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    static class Void {
        private String name;

        public Void(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class GalaxyCluster {
        private String name;
        private List<GalaxyGroup> groups;

        GalaxyCluster(String name, List<GalaxyGroup> groups) {
            this.name = name;
            this.groups = groups;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<GalaxyGroup> getGroups() {
            return groups;
        }

        public void setGroups(List<GalaxyGroup> groups) {
            this.groups = groups;
        }

        static class GalaxyGroup {
            private String name;
            private List<Galaxy> galaxies;

            public GalaxyGroup(String name, List<Galaxy> galaxies) {
                this.name = name;
                this.galaxies = galaxies;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<Galaxy> getGalaxies() {
                return galaxies;
            }

            public void setGalaxies(List<Galaxy> galaxies) {
                this.galaxies = galaxies;
            }

            static class Galaxy {
                private String name;
                private GalaxyType type;
                private List<SpiralArm> spiralArms;

                Galaxy(String name, GalaxyType type, List<SpiralArm> spiralArms) {
                    this.name = name;
                    this.type = type;
                    this.spiralArms = spiralArms;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public GalaxyType getType() {
                    return type;
                }

                public void setType(GalaxyType type) {
                    this.type = type;
                }

                public List<SpiralArm> getSpiralArms() {
                    return spiralArms;
                }

                public void setSpiralArms(List<SpiralArm> spiralArms) {
                    this.spiralArms = spiralArms;
                }

                static class SpiralArm {
                    private String name;
                    private List<StarCluster> starClusters;

                    SpiralArm(String name, List<StarCluster> starClusters) {
                        this.name = name;
                        this.starClusters = starClusters;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public List<StarCluster> getStarClusters() {
                        return starClusters;
                    }

                    public void setStarClusters(List<StarCluster> starClusters) {
                        this.starClusters = starClusters;
                    }

                    static class StarCluster {
                        private String name;
                        private List<StarSystem> systems;

                        public StarCluster(String name, List<StarSystem> systems) {
                            this.name = name;
                            this.systems = systems;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<StarSystem> getSystems() {
                            return systems;
                        }

                        public void setSystems(List<StarSystem> systems) {
                            this.systems = systems;
                        }

                        static class StarSystem {
                            private String name;
                            private Star star;
                            private List<Planet> planets;

                            StarSystem(String name, Star star, List<Planet> planets) {
                                this.name = name;
                                this.star = star;
                                this.planets = planets;
                            }

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public Star getStar() {
                                return star;
                            }

                            public void setStar(Star star) {
                                this.star = star;
                            }

                            public List<Planet> getPlanets() {
                                return planets;
                            }

                            public void setPlanets(List<Planet> planets) {
                                this.planets = planets;
                            }

                            static class SpaceBody {
                                protected String name;
                                protected double radius;

                                SpaceBody(String name, double radius) {
                                    this.name = name;
                                    this.radius = radius;
                                }

                                public String getName() {
                                    return name;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public double getRadius() {
                                    return radius;
                                }

                                public void setRadius(double radius) {
                                    this.radius = radius;
                                }
                            }

                            static class Star extends SpaceBody {
                                private double coreTemperature;
                                private StarColor color;

                                Star(String name, double radius, double coreTemperature, StarColor color) {
                                    super(name, radius);
                                    this.coreTemperature = coreTemperature;
                                    this.color = color;
                                }

                                public double getCoreTemperature() {
                                    return coreTemperature;
                                }

                                public void setCoreTemperature(double coreTemperature) {
                                    this.coreTemperature = coreTemperature;
                                }

                                public StarColor getColor() {
                                    return color;
                                }

                                public void setColor(StarColor color) {
                                    this.color = color;
                                }
                            }

                            static class Planet extends SpaceBody {
                                private double avgTemperature;
                                private boolean isInhabited;
                                private List<Satellite> satellites;

                                Planet(String name, double radius, double avgTemperature, boolean isInhabited, List<Satellite> satellites) {
                                    super(name, radius);
                                    this.avgTemperature = avgTemperature;
                                    this.isInhabited = isInhabited;
                                    this.satellites = satellites;
                                }

                                public double getAvgTemperature() {
                                    return avgTemperature;
                                }

                                public void setAvgTemperature(double avgTemperature) {
                                    this.avgTemperature = avgTemperature;
                                }

                                public boolean isInhabited() {
                                    return isInhabited;
                                }

                                public void setInhabited(boolean inhabited) {
                                    isInhabited = inhabited;
                                }

                                public List<Satellite> getSatellites() {
                                    return satellites;
                                }

                                public void setSatellites(List<Satellite> satellites) {
                                    this.satellites = satellites;
                                }
                            }

                            static class Satellite extends SpaceBody {
                                private double avgTemperature;
                                private boolean isInhabited;

                                Satellite(String name, double radius, double avgTemperature, boolean isInhabited, List<Satellite> satellites) {
                                    super(name, radius);
                                    this.avgTemperature = avgTemperature;
                                    this.isInhabited = isInhabited;
                                }

                                public double getAvgTemperature() {
                                    return avgTemperature;
                                }

                                public void setAvgTemperature(double avgTemperature) {
                                    this.avgTemperature = avgTemperature;
                                }

                                public boolean isInhabited() {
                                    return isInhabited;
                                }

                                public void setInhabited(boolean inhabited) {
                                    isInhabited = inhabited;
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    enum StarColor {
        RED, ORANGE, YELLOW, YELLOW_WHITE, WHITE, WHITE_BLUE, BLUE
    }

    enum GalaxyType {
        SPIRAL, BARRED_SPIRAL, ELLIPTICAL, IRREGULAR
    }
}
