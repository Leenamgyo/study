def example_func(param1, param2):
    """Example function with types documented in the docstring.

    Args:
        param1 (int): The first parameter.
        parame2 (str): The second parameter.
    
    Returns:
        bool: The return value. True for success, False otherwise
    
    """
    print(param1)
    print(param2)
    return True


# how to print document
print(example_func.__doc__)
help(example_func)
    
    