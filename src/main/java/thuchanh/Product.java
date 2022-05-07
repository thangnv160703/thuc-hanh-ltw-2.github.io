package thuchanh;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {
	@NotNull
	private final String code;
	private final String description;
	private final String price;
}
