inherit python_pyo3 python_pep517 setuptools3-base

DEPENDS += "python3-setuptools-rust-native python3-maturin-native python3-wheel-native"

python_maturin_do_configure() {
    python_pyo3_do_configure
    cargo_common_do_configure
}

EXPORT_FUNCTIONS do_configure
