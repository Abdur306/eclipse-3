package Level3;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Vechile
 class Vehicle {
private String vehicleNumber;
private String vehicleColor;

public Vehicle(String vehicleNumber, String vehicleColor) {
    this.vehicleNumber = vehicleNumber;
    this.vehicleColor = vehicleColor;
}

public String getVehicleNumber() {
    return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
}

public String getVehicleColor() {
    return vehicleColor;
}

public void setVehicleColor(String vehicleColor) {
    this.vehicleColor = vehicleColor;
}
}
//Parking slot
class Slot {
    
    private String id;
    private Integer number;
    private boolean isEmpty;
    private Vehicle parkVehicle;

    public Slot(String id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Vehicle getParkVehicle() {
        return parkVehicle;
    }

    public void setParkVehicle(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
    }

    public void removeVehicle() {
        parkVehicle = null;
        this.isEmpty = false;
    }

    public void placeVehicle(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
        this.isEmpty = true;
    }

    public Integer getSlotNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//PArking
 class Parking implements ParkingFloor {
	  private static Parking parkingLot;
	private int floorNumber;
	private List<Slot> slots;


	private Parking(int floorNumber) {
	    this.floorNumber = floorNumber;
	    this.slots = new ArrayList<>();
	}

	public static Parking getParkingFloor(int floorNumber) {
	    if (parkingLot == null)
	        parkingLot = new Parking(floorNumber);
	    return parkingLot;
	}

	public static void clearAll() {
	    parkingLot = null;
	}

	private Slot getNextEmptySlotOnFloor() throws NoEmptySlotAvailable {
	    for (Slot slot : slots) {
	        if (!slot.isEmpty()) {
	            return slot;
	        }
	    }
	    throw new NoEmptySlotAvailable("For floorNumber " + floorNumber + " No Empty Slot available");
	}

	public boolean createParkingSLot(int numberOfSlots) {
	    if (inputValidator(InputValidator.isValidSlotNumber(numberOfSlots)) || slots.size() > 0)
	        return false;

	    for (int i = 1; i <= numberOfSlots; i++) {
	        slots.add(new Slot(UUID.randomUUID().toString(), i));
	    }
	    System.out.printf("Created a parking lot with %s slots %n", numberOfSlots);
	    return true;
	}

	private boolean inputValidator(boolean validSlotNumber) {
	    if (!validSlotNumber) {
	        return true;
	    }
	    return false;
	}

	public boolean parkVehicle(Vehicle vehicle) throws NoEmptySlotAvailable {
	    Slot nextEmptySlotOnFloor = getNextEmptySlotOnFloor();
	    nextEmptySlotOnFloor.placeVehicle(vehicle);
	    System.out.printf("Allocated slot number: %d \n", nextEmptySlotOnFloor.getSlotNumber());
	    return true;
	}

	public int unParkVehicle(int slotNumber) {
	    if (slotNumber <= 0) {
	        throw new InvalidSlotNumberException(String.format("%d is invalid slot number,slotNumber > 1", slotNumber));
	    }
	    Slot slot = slots.get(slotNumber - 1);
	    if (slot != null) {
	        slot.removeVehicle();
	    } else {
	        throw new InvalidSlotNumberException(String.format("%d is invalid slot number", slotNumber));
	    }
	    return slotNumber;
	}

	public void printStatus() {
	    System.out.println("Slot No.  Registration No   Color");
	    slots.forEach(slot->{
	        if (!slots.isEmpty()) {
	            Vehicle parkVehicle = slot.getParkVehicle();
	            if (parkVehicle != null)
	                System.out.printf("%d          %s    %s\n", slot.getSlotNumber(), parkVehicle.getVehicleNumber(), parkVehicle.getVehicleColor());
	        }
	    });
	}

	public List<String> getVehicleNumbersByColor(String color) {
	    List<String> vehicleNumbers = new ArrayList<>();
	    slots.forEach(slot->{
	        if (slot.isEmpty() && slot.getParkVehicle().getVehicleColor().equalsIgnoreCase(color)) {
	            vehicleNumbers.add(slot.getParkVehicle().getVehicleNumber());
	        }
	    });
	    if (vehicleNumbers.isEmpty()) {
	        throw new VehicleNotFoundException(String.format("Vehicle not found for color %s", color));
	    }
	    return vehicleNumbers;
	}

	public List<Integer> getSlotNumbersByColor(String color) {
	    List<Integer> slotNumbers = this.slots.stream()
	            .filter(slot->slot.isEmpty() && slot.getParkVehicle().getVehicleColor().equalsIgnoreCase(color)).map(Slot::getSlotNumber)
	            .collect(Collectors.toList());
	    if (slotNumbers.isEmpty()) {
	        throw new VehicleNotFoundException(String.format("Vehicle not found for color %s", color));
	    }
	    return slotNumbers;
	}

	public Integer getSlotNumberByVehicleNumber(String vehicleNumber) {
	    Optional<Integer> slotOptional = slots.stream()
	            .filter(slot->slot.getParkVehicle().getVehicleNumber().equalsIgnoreCase(vehicleNumber)).map(Slot::getSlotNumber)
	            .findAny();
	    return slotOptional.orElseThrow(()->new VehicleNotFoundException(String.format("Provided vehicle number %s is not present", vehicleNumber)));
	}
	}