#Create a length converter function.

def convert_length(value, from_unit, to_unit):
    # Conversion factors to meters
    conversion_factors = {
        'meters': 1,
        'kilometers': 1000,
        'centimeters': 0.01,
        'millimeters': 0.001,
        'miles': 1609.34,
        'yards': 0.9144,
        'feet': 0.3048,
        'inches': 0.0254
    }

    if from_unit not in conversion_factors or to_unit not in conversion_factors:
        raise ValueError("Invalid units provided.")

    # Convert from the original unit to meters
    value_in_meters = value * conversion_factors[from_unit]
    # Convert from meters to the target unit
    converted_value = value_in_meters / conversion_factors[to_unit]

    return converted_value

if __name__ == "__main__":
    value = 100
    from_unit = 'meters'
    to_unit = 'kilometers'
    result = convert_length(value, from_unit, to_unit)
    print(f"{value} {from_unit} is equal to {result} {to_unit}")
